package co.simplon.AlloPito.business.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.AlloPito.business.convert.ServiceConvert;
import co.simplon.AlloPito.business.dto.ServiceDto;
import co.simplon.AlloPito.persistence.repository.IServiceRepository;

@Service
public class ServiceServiceImpl implements IServiceService {

	private IServiceRepository repo;

	@Override
	public List<ServiceDto> getServices() {
		return ServiceConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public ServiceDto getServiceById(final int id) {
		return ServiceConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public ServiceDto postService(ServiceDto service) {
		return ServiceConvert.getInstance()
				.convertEntityToDto(repo.save(ServiceConvert.getInstance().convertDtoToEntity(service)));
	}

	@Override
	public void deleteService(ServiceDto service) {
		repo.delete(ServiceConvert.getInstance().convertDtoToEntity(service));
	}

	@Autowired
	public void setRepo(IServiceRepository repo) {
		this.repo = repo;
	}

}
