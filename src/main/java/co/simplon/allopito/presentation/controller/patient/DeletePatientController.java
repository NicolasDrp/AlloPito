package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

/**
 * Controller class for handling requests to delete patients.
 */
@RestController
@CrossOrigin
public class DeletePatientController {

	private IPatientService service;

	/**
	 * Deletes a patient using the provided patient DTO.
	 *
	 * @param patientDto The DTO representing the patient to be deleted.
	 */
	@DeleteMapping("/patients")
	public void deletePatient(@RequestBody final PatientDto patientDto) {
		service.deletePatient(patientDto);
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
