package co.simplon.allopito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to delete a service.
 */
@RestController
@CrossOrigin
public class DeleteServiceController {

	private IServiceService service;

	/**
	 * Deletes a service.
	 *
	 * @param serviceDto The DTO representing the service to be deleted.
	 */
	@DeleteMapping("/services")
	public void deleteService(@RequestBody final ServiceDto serviceDto) {
		service.deleteService(serviceDto);
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
