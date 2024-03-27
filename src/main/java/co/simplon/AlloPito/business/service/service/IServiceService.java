package co.simplon.AlloPito.business.service.service;

import java.util.List;

import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.business.dto.PatientDto;
import co.simplon.AlloPito.business.dto.ServiceDto;

public interface IServiceService {

	List<ServiceDto> getServices();
	
	ServiceDto getServiceById(final int id);
	
	ServiceDto postService(final ServiceDto service);
	
	void deleteService(final ServiceDto service);
	
	BedDto affectPatientToService(final int id_service,final PatientDto patient);
	
}
