package co.simplon.allopito.business.service.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.allopito.business.convert.BedConvert;
import co.simplon.allopito.business.convert.PatientConvert;
import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.repository.IBedRepository;

@Service
public class BedServiceImpl implements IBedService {

	private IBedRepository repo;

	@Override
	public List<BedDto> getBeds() {
		return BedConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public BedDto getBedById(final int id) {
		return BedConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public BedDto postBed(final BedDto bed) {
		return BedConvert.getInstance().convertEntityToDto(repo.save(BedConvert.getInstance().convertDtoToEntity(bed)));
	}

	@Override
	public void deleteBed(final BedDto bed) {
		repo.delete(BedConvert.getInstance().convertDtoToEntity(bed));
	}

	@Override
	public List<BedDto> getEmptyBedsByService(final int idService) {
		return BedConvert.getInstance().convertListEntityToListDto(repo.getEmptyBedsByService(idService));
	}

	@Override
	public void removePatientFromBed(PatientDto patient) {
		repo.removePatientFromBed(PatientConvert.getInstance().convertDtoToEntity(patient));
	}

	@Autowired
	public void setRepo(IBedRepository repo) {
		this.repo = repo;
	}
}
