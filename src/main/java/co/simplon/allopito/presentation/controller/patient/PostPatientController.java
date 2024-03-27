package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class PostPatientController {

	private IPatientService service;

	@PostMapping("/patients")
	public PatientDto postPatient(@RequestBody final PatientDto patientDto) {
		return service.postPatient(patientDto);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
}
