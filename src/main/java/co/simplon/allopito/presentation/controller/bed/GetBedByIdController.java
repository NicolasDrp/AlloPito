package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

/**
 * Controller class for handling requests to get a bed by its ID.
 */
@RestController
@CrossOrigin
public class GetBedByIdController {

	private IBedService service;

	/**
	 * Retrieves a bed by its ID.
	 *
	 * @param id The ID of the bed to retrieve.
	 * @return The DTO representing the retrieved bed.
	 */
	@GetMapping("/beds/{id}")
	public BedDto getBedById(@PathVariable final int id) {
		return service.getBedById(id);
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
