package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

/**
 * Controller class for handling requests to retrieve all patients.
 */
@RestController
@CrossOrigin
public class GetPatientsController {

	private IPatientService service;

	/**
	 * Retrieves all patients.
	 *
	 * @return A list of DTOs representing all patients.
	 */
	@GetMapping("/patients")
	public List<PatientDto> getPatients() {
		return service.getPatients();
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
