package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.persistence.entity.Bed;

@Component
public class BedConvert {

	private static BedConvert instance;

	private BedConvert() {
	}

	public static BedConvert getInstance() {
		if (instance == null) {
			instance = new BedConvert();
		}
		return instance;
	}

	public BedDto convertEntityToDto(final Bed bed) {
		if (bed == null) {
			throw new IllegalArgumentException("Bed ne peut pas être null");
		}
		final BedDto dto = new BedDto();
		dto.setId_bed(bed.getId_bed());
		if (bed.getPatient() == null) {
			dto.setPatient(null);
		} else {
			dto.setPatient(PatientConvert.getInstance().convertEntityToDto(bed.getPatient()));
		}
		dto.setRoom(RoomConvert.getInstance().convertEntityToDto(bed.getRoom()));
		return dto;
	}

	public List<BedDto> convertListEntityToListDto(final List<Bed> list) {
		final List<BedDto> listDto = new ArrayList<>();
		for (Bed bed : list) {
			listDto.add(convertEntityToDto(bed));
		}
		return listDto;
	}

	public Bed convertDtoToEntity(final BedDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("BedDto ne peut pas être null");
		}
		final Bed bed = new Bed();
		bed.setId_bed(dto.getId_bed());
		if (dto.getPatient() == null) {
			dto.setPatient(null);
		} else {
			bed.setPatient(PatientConvert.getInstance().convertDtoToEntity(dto.getPatient()));
		}
		bed.setRoom(RoomConvert.getInstance().convertDtoToEntity(dto.getRoom()));
		return bed;
	}

	public List<Bed> convertListDtoToListEntity(final List<BedDto> listDto) {
		final List<Bed> list = new ArrayList<>();
		for (BedDto dto : listDto) {
			list.add(convertDtoToEntity(dto));
		}
		return list;
	}

}
