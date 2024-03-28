package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

/**
 * Controller class for handling requests to delete a bed.
 */
@RestController
@CrossOrigin
public class DeleteBedController {

	private IBedService service;

	/**
	 * Deletes a bed.
	 *
	 * @param bedDto The DTO representing the bed to be deleted.
	 */
	@DeleteMapping("/beds")
	public void deleteBed(@RequestBody final BedDto bedDto) {
		service.deleteBed(bedDto);
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
