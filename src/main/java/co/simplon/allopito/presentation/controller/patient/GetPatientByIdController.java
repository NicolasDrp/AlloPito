package co.simplon.allopito.presentation.controller.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;

@RestController
@CrossOrigin
public class GetPatientByIdController {

	private IPatientService service;

	@GetMapping("/patients/{id}")
	public PatientDto getPatientById(@PathVariable final int id) {
		return service.getPatientById(id);
	}

	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
}
