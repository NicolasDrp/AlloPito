package co.simplon.AlloPito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class GetBedByIdController {

	private IBedService service;

	@GetMapping("/beds/{id}")
	public BedDto getBedById(@PathVariable final int id) {
		return service.getBedById(id);
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}

}
