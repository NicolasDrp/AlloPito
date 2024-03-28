package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

/**
 * Controller class for handling requests to retrieve a patient by ID.
 */
@RestController
@CrossOrigin
public class GetPatientByIdController {

	private IPatientService service;

	/**
	 * Retrieves a patient by ID.
	 *
	 * @param id The ID of the patient to retrieve.
	 * @return The DTO representing the retrieved patient.
	 */
	@GetMapping("/patients/{id}")
	public PatientDto getPatientById(@PathVariable final int id) {
		return service.getPatientById(id);
	}

	/**
	 * Sets the patient service for this controller.
	 *
	 * @param service The patient service to be set.
	 */
	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
}
