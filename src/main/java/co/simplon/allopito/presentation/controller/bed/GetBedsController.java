package co.simplon.allopito.presentation.controller.bed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.service.bed.IBedService;

import java.util.List;

/**
 * Controller class for handling requests to get all beds.
 */
@RestController
@CrossOrigin
public class GetBedsController {

	private IBedService service;

	/**
	 * Retrieves all beds.
	 *
	 * @return The list of DTOs representing all beds.
	 */
	@GetMapping("/beds")
	public List<BedDto> getBeds() {
		return service.getBeds();
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
