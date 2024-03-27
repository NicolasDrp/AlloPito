package co.simplon.AlloPito.presentation.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.business.dto.PatientDto;
import co.simplon.AlloPito.business.service.service.IServiceService;

@RestController
@CrossOrigin
public class AffectPatientToServiceController {
	
	private IServiceService service;

	@PostMapping("/services/affect/{idService}")
	public BedDto affectPatientToService(@PathVariable final int idService,@RequestBody final PatientDto patient) {
		return service.affectPatientToService(idService,patient);
	}

	@Autowired
	public void setService(IServiceService service) {
		this.service = service;
	}

}
