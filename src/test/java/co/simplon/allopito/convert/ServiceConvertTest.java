package co.simplon.allopito.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.allopito.business.convert.ServiceConvert;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Service;

class ServiceConvertTest {

	private int idService = 1;

	private String nameService = "Urgences";

	@Test
	void convertEntityToDto() {
		Service service = new Service();
		service.setIdService(idService);
		service.setNameService(nameService);

		ServiceDto dto = ServiceConvert.getInstance().convertEntityToDto(service);

		assertEquals(service.getIdService(), dto.getIdService());
		assertEquals(service.getNameService(), dto.getNameService());
	}

	@Test
	void convertEntityToDtoException() {
		assertThrows(IllegalArgumentException.class, () -> ServiceConvert.getInstance().convertEntityToDto(null));
	}

	@Test
	void convertListEntityToListDto() {
		List<Service> listService = new ArrayList<>();
		Service service1 = new Service();
		Service service2 = new Service();
		service1.setIdService(1);
		service2.setIdService(2);
		listService.add(service1);
		listService.add(service2);

		List<ServiceDto> listDto = ServiceConvert.getInstance().convertListEntityToListDto(listService);
		assertEquals(listDto.size(), listService.size());
	}

	@Test
	void convertDtoToEntity() {
		ServiceDto dto = new ServiceDto();
		dto.setIdService(idService);
		dto.setNameService(nameService);

		Service service = ServiceConvert.getInstance().convertDtoToEntity(dto);

		assertEquals(dto.getIdService(), service.getIdService());
		assertEquals(dto.getNameService(), service.getNameService());
	}

	@Test
	void convertDtoToEntityException() {
		assertThrows(IllegalArgumentException.class, () -> ServiceConvert.getInstance().convertDtoToEntity(null));
	}

	@Test
	void convertListDtoToListEntity() {
		List<ServiceDto> listDto = new ArrayList<>();
		ServiceDto service1 = new ServiceDto();
		ServiceDto service2 = new ServiceDto();
		service1.setIdService(1);
		service2.setIdService(2);
		listDto.add(service1);
		listDto.add(service2);

		List<Service> listService = ServiceConvert.getInstance().convertListDtoToListEntity(listDto);
		assertEquals(listService.size(), listDto.size());
	}
}
