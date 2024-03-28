package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.persistence.entity.Bed;

/**
 * This class provides methods to convert between Bed entities and DTOs.
 */
@Component
public class BedConvert {

	private static BedConvert instance;

	private BedConvert() {
	}

	/**
	 * Retrieves the singleton instance of BedConvert.
	 *
	 * @return The singleton instance of BedConvert.
	 */
	public static BedConvert getInstance() {
		if (instance == null) {
			instance = new BedConvert();
		}
		return instance;
	}

	/**
	 * Converts a Bed entity to a BedDto.
	 *
	 * @param bed The Bed entity to be converted.
	 * @return The corresponding BedDto.
	 * @throws IllegalArgumentException If the input bed is null.
	 */
	public BedDto convertEntityToDto(final Bed bed) {
		if (bed == null) {
			throw new IllegalArgumentException("Bed cannot be null");
		}
		final BedDto dto = new BedDto();
		dto.setIdBed(bed.getIdBed());
		if (bed.getPatient() == null) {
			dto.setPatient(null);
		} else {
			dto.setPatient(PatientConvert.getInstance().convertEntityToDto(bed.getPatient()));
		}
		dto.setRoom(RoomConvert.getInstance().convertEntityToDto(bed.getRoom()));
		return dto;
	}

	/**
	 * Converts a list of Bed entities to a list of BedDto objects.
	 *
	 * @param list The list of Bed entities to be converted.
	 * @return The corresponding list of BedDto objects.
	 */
	public List<BedDto> convertListEntityToListDto(final List<Bed> list) {
		final List<BedDto> listDto = new ArrayList<>();
		for (Bed bed : list) {
			listDto.add(convertEntityToDto(bed));
		}
		return listDto;
	}

	/**
	 * Converts a BedDto to a Bed entity.
	 *
	 * @param dto The BedDto to be converted.
	 * @return The corresponding Bed entity.
	 * @throws IllegalArgumentException If the input dto is null.
	 */
	public Bed convertDtoToEntity(final BedDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("BedDto cannot be null");
		}
		final Bed bed = new Bed();
		bed.setIdBed(dto.getIdBed());
		if (dto.getPatient() == null) {
			dto.setPatient(null);
		} else {
			bed.setPatient(PatientConvert.getInstance().convertDtoToEntity(dto.getPatient()));
		}
		bed.setRoom(RoomConvert.getInstance().convertDtoToEntity(dto.getRoom()));
		return bed;
	}

	/**
	 * Converts a list of BedDto objects to a list of Bed entities.
	 *
	 * @param listDto The list of BedDto objects to be converted.
	 * @return The corresponding list of Bed entities.
	 */
	public List<Bed> convertListDtoToListEntity(final List<BedDto> listDto) {
		final List<Bed> list = new ArrayList<>();
		for (BedDto dto : listDto) {
			list.add(convertDtoToEntity(dto));
		}
		return list;
	}

}
