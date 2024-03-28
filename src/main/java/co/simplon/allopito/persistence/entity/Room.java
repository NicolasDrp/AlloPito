package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents a Room entity in the system.
 */
@Entity
@Table(name = "room")
public class Room {

	/**
	 * The unique identifier of the room.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRoom;

	/**
	 * The room number.
	 */
	@Column(name = "number_room", length = 5, nullable = false)
	private String numberRoom;

	/**
	 * The service associated with the room.
	 */
	@ManyToOne
	@JoinColumn(name = "id_service", nullable = false)
	private Service service;

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
	 * Returns the room number.
	 *
	 * @return The room number.
	 */
	public String getNumberRoom() {
		return numberRoom;
	}

	/**
	 * Sets the room number.
	 *
	 * @param numberRoom The room number.
	 */
	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}

	/**
	 * Returns the service associated with the room.
	 *
	 * @return The service associated with the room.
	 */
	public Service getService() {
		return service;
	}

	/**
	 * Sets the service associated with the room.
	 *
	 * @param service The service associated with the room.
	 */
	public void setService(Service service) {
		this.service = service;
	}
}
