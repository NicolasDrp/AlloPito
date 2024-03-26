package co.simplon.AlloPito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.ServiceDto;
import co.simplon.AlloPito.business.service.service.IServiceService;

@RestController
@CrossOrigin
public class GetServiceByIdController {

	private IServiceService service;

	@GetMapping("/services/{id}")
	public ServiceDto getServiceById(@PathVariable final int id) {
		return service.getServiceById(id);
	}

	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}

}
