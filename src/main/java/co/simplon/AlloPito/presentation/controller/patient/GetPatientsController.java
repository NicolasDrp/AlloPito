package co.simplon.AlloPito.presentation.controller.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.PatientDto;
import co.simplon.AlloPito.business.service.product.IPatientService;

@RestController
@CrossOrigin
public class GetPatientsController {

	private IPatientService service;

	
	@GetMapping("/patients")
	public List<PatientDto> getPatients(){
		return service.getPatients();
	}
	
	
	@Autowired
	public void setService(IPatientService service) {
		this.service = service;
	}
	
	
	
}
