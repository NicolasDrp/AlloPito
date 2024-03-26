package co.simplon.AlloPito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class DeleteBedController {

	private IBedService service;

	@DeleteMapping("/beds")
	public void deleteBed(@RequestBody final BedDto bedDto) {
		service.deleteBed(bedDto);
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}

}
