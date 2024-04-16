package co.simplon.allopito.business.service.bed;

import java.util.List;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.RoomDto;

/**
 * This interface defines the bed-related services.
 */
public interface IBedService {

	/**
	 * Retrieves a list of all beds.
	 *
	 * @return A list of all beds.
	 */
	public List<BedDto> getBeds();

	/**
	 * Retrieves a bed by its unique identifier.
	 *
	 * @param id The unique identifier of the bed.
	 * @return The bed DTO corresponding to the given identifier.
	 */
	public BedDto getBedById(final int id);

	/**
	 * Creates a new bed.
	 *
	 * @param bed The DTO representing the bed to be created.
	 * @return The DTO representing the newly created bed.
	 */
	public BedDto postBed(final BedDto bed);

	/**
	 * Deletes a bed.
	 *
	 * @param bed The DTO representing the bed to be deleted.
	 */
	public void deleteBed(final BedDto bed);

	/**
	 * Retrieves a list of empty beds for a given service.
	 *
	 * @param idService The unique identifier of the service.
	 * @return A list of empty beds for the specified service.
	 */
	public List<BedDto> getEmptyBedsByService(final int idService);

	/**
	 * Removes a patient from a bed.
	 *
	 * @param patient The DTO representing the patient to be removed from the bed.
	 */
	void removePatientFromBed(final PatientDto patient);

	/**
	 * Removes a room from a bed.
	 *
	 * @param patient The DTO representing the room to be removed from the bed.
	 */
	void removeRoomFromBed(RoomDto room);

}
