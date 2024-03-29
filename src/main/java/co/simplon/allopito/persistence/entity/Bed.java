package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * This class represents a Bed entity in the system.
 */
@Entity
@Table(name = "bed")
public class Bed {

	/**
	 * The unique identifier of the bed.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bed")
	private int idBed;

	/**
	 * The patient assigned to the bed.
	 */
	@OneToOne
	@JoinColumn(name = "id_patient")
	private Patient patient;

	/**
	 * The room where the bed is located.
	 */
	@ManyToOne
	@JoinColumn(name = "id_room")
	private Room room;

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
	 * Returns the patient assigned to the bed.
	 *
	 * @return The patient assigned to the bed.
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * Sets the patient assigned to the bed.
	 *
	 * @param patient The patient assigned to the bed.
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * Returns the room where the bed is located.
	 *
	 * @return The room where the bed is located.
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * Sets the room where the bed is located.
	 *
	 * @param room The room where the bed is located.
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
}
