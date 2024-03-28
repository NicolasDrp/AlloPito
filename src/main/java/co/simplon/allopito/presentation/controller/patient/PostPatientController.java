package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

/**
 * Controller class for handling requests to create a new patient.
 */
@RestController
@CrossOrigin
public class PostPatientController {

	private IPatientService service;

	/**
	 * Creates a new patient.
	 *
	 * @param patientDto The DTO representing the patient to be created.
	 * @return The DTO representing the newly created patient.
	 */
	@PostMapping("/patients")
	public PatientDto postPatient(@RequestBody final PatientDto patientDto) {
		return service.postPatient(patientDto);
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
