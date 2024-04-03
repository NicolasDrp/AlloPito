package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

/**
 * Controller class for handling requests to update beds.
 */
@RestController
@CrossOrigin
public class PutBedController {

	private IBedService service;

	/**
	 * Update a bed.
	 *
	 * @param bedDto The DTO representing the bed to be updated.
	 * @return The DTO representing the updated bed.
	 */
	@PutMapping("/beds")
	public BedDto putBed(@RequestBody final BedDto bedDto) {
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
