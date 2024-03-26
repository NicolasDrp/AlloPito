package co.simplon.AlloPito.business.service.bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.AlloPito.business.convert.BedConvert;
import co.simplon.AlloPito.business.dto.BedDto;
import co.simplon.AlloPito.persistence.repository.IBedRepository;

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
	public BedDto postBed(BedDto bed) {
		return BedConvert.getInstance().convertEntityToDto(repo.save(BedConvert.getInstance().convertDtoToEntity(bed)));
	}

	@Override
	public void deleteBed(BedDto bed) {
		repo.delete(BedConvert.getInstance().convertDtoToEntity(bed));
	}

	@Autowired
	public void setRepo(IBedRepository repo) {
		this.repo = repo;
	}

}
