package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Service;

@Component
public class ServiceConvert {

	private static ServiceConvert instance;

	private ServiceConvert() {
	}

	public static ServiceConvert getInstance() {
		if (instance == null) {
			instance = new ServiceConvert();
		}
		return instance;
	}

	public Service convertDtoToEntity(final ServiceDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("ServiceDto ne peut pas être null");
		}
		final Service service = new Service();
		service.setIdService(dto.getIdService());
		service.setNameService(dto.getNameService());
		return service;
	}

	public List<Service> convertListDtoToListEntity(final List<ServiceDto> listDto) {
		final List<Service> result = new ArrayList<>();
		for (ServiceDto serviceDto : listDto) {
			result.add(convertDtoToEntity(serviceDto));
		}
		return result;
	}

	public ServiceDto convertEntityToDto(final Service service) {
		if (service == null) {
			throw new IllegalArgumentException("Service ne peut pas être null");
		}
		ServiceDto result = new ServiceDto();
		result.setIdService(service.getIdService());
		result.setNameService(service.getNameService());
		return result;
	}

	public List<ServiceDto> convertListEntityToListDto(List<Service> list) {
		final List<ServiceDto> listDto = new ArrayList<>();
		for (Service service : list) {
			listDto.add(convertEntityToDto(service));
		}
		return listDto;
	}

}
