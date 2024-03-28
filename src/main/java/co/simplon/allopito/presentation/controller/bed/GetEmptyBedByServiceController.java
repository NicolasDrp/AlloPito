package co.simplon.allopito.presentation.controller.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

@RestController
@CrossOrigin
public class GetEmptyBedByServiceController {

	private IBedService service;

	@GetMapping("/beds/empty/{idService}")
	public List<BedDto> getEmptyBedsByService(@PathVariable int idService) {
		return service.getEmptyBedsByService(idService);
	}

	@Autowired
	public void setService(final IBedService service) {
		this.service = service;
	}

}
