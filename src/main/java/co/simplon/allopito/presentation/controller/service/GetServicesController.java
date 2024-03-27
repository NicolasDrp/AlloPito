package co.simplon.allopito.presentation.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;

@RestController
@CrossOrigin
public class GetServicesController {

	private IServiceService service;

	@GetMapping("/services")
	public List<ServiceDto> getServices() {
		return service.getServices();
	}

	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}
}
