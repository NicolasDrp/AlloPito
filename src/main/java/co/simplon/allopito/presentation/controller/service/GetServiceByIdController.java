package co.simplon.allopito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to retrieve a service by its ID.
 */
@RestController
@CrossOrigin
public class GetServiceByIdController {

	private IServiceService service;

	/**
	 * Retrieves a service by its ID.
	 *
	 * @param id The ID of the service to retrieve.
	 * @return The DTO representing the retrieved service.
	 */
	@GetMapping("/services/{id}")
	public ServiceDto getServiceById(@PathVariable final int id) {
		return service.getServiceById(id);
	}

	/**
	 * Sets the service for this controller.
	 *
	 * @param service The service to be set.
	 */
	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}

}
