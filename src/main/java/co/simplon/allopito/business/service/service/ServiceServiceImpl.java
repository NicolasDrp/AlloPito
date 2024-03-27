package co.simplon.allopito.business.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.allopito.business.convert.ServiceConvert;
import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.bed.IBedService;
import co.simplon.allopito.persistence.repository.IServiceRepository;

@Service
public class ServiceServiceImpl implements IServiceService {

	private IServiceRepository repo;

	private IBedService bedService;

	@Override
	public List<ServiceDto> getServices() {
		return ServiceConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public ServiceDto getServiceById(final int id) {
		return ServiceConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public ServiceDto postService(final ServiceDto service) {
		return ServiceConvert.getInstance()
				.convertEntityToDto(repo.save(ServiceConvert.getInstance().convertDtoToEntity(service)));
	}

	@Override
	public void deleteService(final ServiceDto service) {
		repo.delete(ServiceConvert.getInstance().convertDtoToEntity(service));
	}

	@Override
	public BedDto affectPatientToService(final int id_service, final PatientDto patient) {

		final List<BedDto> beds = bedService.getEmptyBedsByService(id_service);
		if (beds.isEmpty()) {
			throw new IllegalStateException("No beds available for this service.");
		}
		bedService.removePatientFromBed(patient);
		beds.get(0).setPatient(patient);
		return bedService.postBed(beds.get(0));
	}

	@Autowired
	public void setRepo(IServiceRepository repo) {
		this.repo = repo;
	}

	@Autowired
	public void setBedService(IBedService bedService) {
		this.bedService = bedService;
	}

}
