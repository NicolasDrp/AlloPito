package co.simplon.allopito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to update services.
 */
@RestController
@CrossOrigin
public class PutServiceController {

	private IServiceService service;

	/**
	 * Update a service.
	 *
	 * @param serviceDto The DTO representing the service to be updated.
	 * @return The DTO representing the updated service.
	 */
	@PutMapping("/services")
	public ServiceDto putService(@RequestBody final ServiceDto serviceDto) {
		return service.postService(serviceDto);
	}

	/**
	 * Sets the service service for this controller.
	 *
	 * @param service The service service to be set.
	 */
	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}

}
