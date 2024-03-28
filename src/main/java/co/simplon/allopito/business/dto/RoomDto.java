package co.simplon.allopito.business.dto;

/**
 * This class represents a DTO (Data Transfer Object) for Room entities.
 */
public class RoomDto {

	/** The unique identifier of the room. */
	private int idRoom;

	/** The number of the room. */
	private String numberRoom;

	/** The service associated with the room. */
	private ServiceDto service;

	/**
	 * Returns the unique identifier of the room.
	 *
	 * @return The unique identifier of the room.
	 */
	public int getIdRoom() {
		return idRoom;
	}

	/**
	 * Sets the unique identifier of the room.
	 *
	 * @param idRoom The unique identifier of the room.
	 */
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	/**
	 * Returns the number of the room.
	 *
	 * @return The number of the room.
	 */
	public String getNumberRoom() {
		return numberRoom;
	}

	/**
	 * Sets the number of the room.
	 *
	 * @param numberRoom The number of the room.
	 */
	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}

	/**
	 * Returns the service associated with the room.
	 *
	 * @return The service associated with the room.
	 */
	public ServiceDto getService() {
		return service;
	}

	/**
	 * Sets the service associated with the room.
	 *
	 * @param service The service associated with the room.
	 */
	public void setService(ServiceDto service) {
		this.service = service;
	}
}
