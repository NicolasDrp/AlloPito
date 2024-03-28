package co.simplon.allopito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.service.IServiceService;

/**
 * Controller class for handling requests to affect a patient to a service.
 */
@RestController
@CrossOrigin
public class AffectPatientToServiceController {

	private IServiceService service;

	/**
	 * Affects a patient to a service.
	 *
	 * @param idService The ID of the service to which the patient will be affected.
	 * @param patient   The DTO representing the patient to be affected.
	 * @return The DTO representing the bed assigned to the patient.
	 */
	@PostMapping("/services/affect/{idService}")
	public BedDto affectPatientToService(@PathVariable final int idService, @RequestBody final PatientDto patient) {
		return service.affectPatientToService(idService, patient);
	}

	/**
	 * Sets the service for this controller.
	 *
	 * @param service The service to be set.
	 */
	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}

}
