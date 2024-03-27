package co.simplon.allopito.presentation.controller.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class GetBedsController {

	private IBedService service;

	@GetMapping("/beds")
	public List<BedDto> getBeds() {
		return service.getBeds();
	}

	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}

}
