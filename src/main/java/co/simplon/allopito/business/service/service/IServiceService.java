package co.simplon.allopito.business.service.service;

import java.util.List;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.ServiceDto;

/**
 * This interface defines the service-related services.
 */
public interface IServiceService {

	/**
	 * Retrieves a list of all services.
	 *
	 * @return A list of all service DTOs.
	 */
	List<ServiceDto> getServices();

	/**
	 * Retrieves a service by its unique identifier.
	 *
	 * @param id The unique identifier of the service.
	 * @return The service DTO corresponding to the given identifier.
	 */
	ServiceDto getServiceById(final int id);

	/**
	 * Creates a new service.
	 *
	 * @param service The DTO representing the service to be created.
	 * @return The DTO representing the newly created service.
	 */
	ServiceDto postService(final ServiceDto service);

	/**
	 * Deletes a service.
	 *
	 * @param service The DTO representing the service to be deleted.
	 */
	void deleteService(final ServiceDto service);

	/**
	 * Assigns a patient to a service.
	 *
	 * @param id_service The unique identifier of the service.
	 * @param patient    The DTO representing the patient to be assigned.
	 * @return The DTO representing the bed where the patient is assigned.
	 */
	BedDto affectPatientToService(final int id_service, final PatientDto patient);

}
