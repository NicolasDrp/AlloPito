package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

/**
 * Controller class for handling requests to create beds.
 */
@RestController
@CrossOrigin
public class PostBedController {

	private IBedService service;

	/**
	 * Creates a new bed.
	 *
	 * @param bedDto The DTO representing the bed to be created.
	 * @return The DTO representing the created bed.
	 */
	@PostMapping("/beds")
	public BedDto postBed(@RequestBody final BedDto bedDto) {
		return service.postBed(bedDto);
	}

	/**
	 * Sets the bed service for this controller.
	 *
	 * @param service The bed service to be set.
	 */
	@Autowired
	public void setService(IBedService service) {
		this.service = service;
	}

}
