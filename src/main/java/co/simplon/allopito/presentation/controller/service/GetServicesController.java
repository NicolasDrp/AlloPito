package co.simplon.allopito.presentation.controller.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to retrieve all services.
 */
@RestController
@CrossOrigin
public class GetServicesController {

	private IServiceService service;

	/**
	 * Retrieves all services.
	 *
	 * @return A list of DTOs representing all services.
	 */
	@GetMapping("/services")
	public List<ServiceDto> getServices() {
		return service.getServices();
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
