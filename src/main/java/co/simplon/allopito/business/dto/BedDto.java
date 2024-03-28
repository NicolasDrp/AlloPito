package co.simplon.allopito.business.dto;

/**
 * This class represents a DTO (Data Transfer Object) for Bed entities.
 */
public class BedDto {

	/** The unique identifier of the bed. */
	private int idBed;

	/** The patient associated with the bed. */
	private PatientDto patient;

	/** The room where the bed is located. */
	private RoomDto room;

	/**
	 * Returns the unique identifier of the bed.
	 *
	 * @return The unique identifier of the bed.
	 */
	public int getIdBed() {
		return idBed;
	}

	/**
	 * Sets the unique identifier of the bed.
	 *
	 * @param idBed The unique identifier of the bed.
	 */
	public void setIdBed(int idBed) {
		this.idBed = idBed;
	}

	/**
	 * Returns the patient associated with the bed.
	 *
	 * @return The patient associated with the bed.
	 */
	public PatientDto getPatient() {
		return patient;
	}

	/**
	 * Sets the patient associated with the bed.
	 *
	 * @param patient The patient associated with the bed.
	 */
	public void setPatient(PatientDto patient) {
		this.patient = patient;
	}

	/**
	 * Returns the room where the bed is located.
	 *
	 * @return The room where the bed is located.
	 */
	public RoomDto getRoom() {
		return room;
	}

	/**
	 * Sets the room where the bed is located.
	 *
	 * @param room The room where the bed is located.
	 */
	public void setRoom(RoomDto room) {
		this.room = room;
	}
}
