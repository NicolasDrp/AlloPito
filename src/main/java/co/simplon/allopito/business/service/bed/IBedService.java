package co.simplon.allopito.business.service.bed;

import java.util.List;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;

public interface IBedService {

	public List<BedDto> getBeds();

	public BedDto getBedById(final int id);

	public BedDto postBed(final BedDto bed);

	public void deleteBed(final BedDto bed);
	
	public List<BedDto> getEmptyBedsByService(final int idService);
	
	void removePatientFromBed(final PatientDto patient);

}
