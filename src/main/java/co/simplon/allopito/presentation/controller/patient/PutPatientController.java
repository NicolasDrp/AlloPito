package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

/**
 * Controller class for handling requests to update patients.
 */
@RestController
@CrossOrigin
public class PutPatientController {

	private IPatientService service;

	/**
	 * Update a patient.
	 *
	 * @param patientDto The DTO representing the patient to be updated.
	 * @return The DTO representing the updated patient.
	 */
	@PutMapping("/patients")
	public PatientDto putPatient(@RequestBody final PatientDto patientDto) {
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
