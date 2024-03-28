package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Service;

/**
 * This class provides methods to convert between Service entities and DTOs.
 */
@Component
public class ServiceConvert {

	private static ServiceConvert instance;

	private ServiceConvert() {
	}

	/**
	 * Retrieves the singleton instance of ServiceConvert.
	 *
	 * @return The singleton instance of ServiceConvert.
	 */
	public static ServiceConvert getInstance() {
		if (instance == null) {
			instance = new ServiceConvert();
		}
		return instance;
	}

	/**
	 * Converts a ServiceDto to a Service entity.
	 *
	 * @param dto The ServiceDto to be converted.
	 * @return The corresponding Service entity.
	 * @throws IllegalArgumentException If the input dto is null.
	 */
	public Service convertDtoToEntity(final ServiceDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("ServiceDto cannot be null");
		}
		final Service service = new Service();
		service.setIdService(dto.getIdService());
		service.setNameService(dto.getNameService());
		return service;
	}

	/**
	 * Converts a list of ServiceDto objects to a list of Service entities.
	 *
	 * @param listDto The list of ServiceDto objects to be converted.
	 * @return The corresponding list of Service entities.
	 */
	public List<Service> convertListDtoToListEntity(final List<ServiceDto> listDto) {
		final List<Service> result = new ArrayList<>();
		for (ServiceDto serviceDto : listDto) {
			result.add(convertDtoToEntity(serviceDto));
		}
		return result;
	}

	/**
	 * Converts a Service entity to a ServiceDto.
	 *
	 * @param service The Service entity to be converted.
	 * @return The corresponding ServiceDto.
	 * @throws IllegalArgumentException If the input service is null.
	 */
	public ServiceDto convertEntityToDto(final Service service) {
		if (service == null) {
			throw new IllegalArgumentException("Service cannot be null");
		}
		ServiceDto result = new ServiceDto();
		result.setIdService(service.getIdService());
		result.setNameService(service.getNameService());
		return result;
	}

	/**
	 * Converts a list of Service entities to a list of ServiceDto objects.
	 *
	 * @param list The list of Service entities to be converted.
	 * @return The corresponding list of ServiceDto objects.
	 */
	public List<ServiceDto> convertListEntityToListDto(List<Service> list) {
		final List<ServiceDto> listDto = new ArrayList<>();
		for (Service service : list) {
			listDto.add(convertEntityToDto(service));
		}
		return listDto;
	}

}
