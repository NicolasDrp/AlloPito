package co.simplon.AlloPito.persistence.entity;

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
	private int id_bed;

	@OneToOne
	@JoinColumn(name = "id_patient")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "id_room", nullable = false)
	private Room room;

	public int getId_bed() {
		return id_bed;
	}

	public void setId_bed(int id_bed) {
		this.id_bed = id_bed;
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
