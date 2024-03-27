package co.simplon.AlloPito.business.service.bed;

import java.util.List;

import co.simplon.AlloPito.business.dto.BedDto;

public interface IBedService {

	public List<BedDto> getBeds();

	public BedDto getBedById(final int id);

	public BedDto postBed(final BedDto bed);

	public void deleteBed(final BedDto bed);
	
	public List<BedDto> getEmptyBedsByService(final int idService);

}
