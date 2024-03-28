package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

import java.util.List;

/**
 * Controller class for handling requests to get empty beds by service.
 */
@RestController
@CrossOrigin
public class GetEmptyBedByServiceController {

	private IBedService service;

	/**
	 * Retrieves empty beds for a specific service.
	 *
	 * @param idService The ID of the service.
	 * @return The list of DTOs representing empty beds for the specified service.
	 */
	@GetMapping("/beds/empty/{idService}")
	public List<BedDto> getEmptyBedsByService(@PathVariable int idService) {
		return service.getEmptyBedsByService(idService);
	}

	/**
	 * Sets the bed service for this controller.
	 *
	 * @param service The bed service to be set.
	 */
	@Autowired
	public void setService(final IBedService service) {
		this.service = service;
	}

}
