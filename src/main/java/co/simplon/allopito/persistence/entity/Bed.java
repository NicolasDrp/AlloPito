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

@Entity
@Table(name = "bed")
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bed")
	private int idBed;

	@OneToOne
	@JoinColumn(name = "id_patient")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "id_room", nullable = false)
	private Room room;

	public int getIdBed() {
		return idBed;
	}

	public void setIdBed(int idBed) {
		this.idBed = idBed;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
