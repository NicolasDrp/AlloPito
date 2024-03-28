package co.simplon.allopito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to create a new service.
 */
@RestController
@CrossOrigin
public class PostServiceController {

	private IServiceService service;

	/**
	 * Creates a new service.
	 *
	 * @param serviceDto The DTO representing the service to be created.
	 * @return The DTO representing the newly created service.
	 */
	@PostMapping("/services")
	public ServiceDto postService(@RequestBody final ServiceDto serviceDto) {
		return service.postService(serviceDto);
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
