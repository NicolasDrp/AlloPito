package co.simplon.AlloPito.business.service.service;

import java.util.List;

import co.simplon.AlloPito.business.dto.ServiceDto;

public interface IServiceService {

	public List<ServiceDto> getServices();
	
	public ServiceDto getServiceById(final int id);
	
	public ServiceDto postService(final ServiceDto service);
	
	public void deleteService(final ServiceDto service);
	
	
	
}
