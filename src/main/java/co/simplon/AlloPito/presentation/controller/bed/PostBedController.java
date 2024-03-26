package co.simplon.AlloPito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class PostBedController {

	private IBedService service;

	@PostMapping("/beds")
	public BedDto postBed(@RequestBody final BedDto bedDto) {
		return service.postBed(bedDto);
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}

}
