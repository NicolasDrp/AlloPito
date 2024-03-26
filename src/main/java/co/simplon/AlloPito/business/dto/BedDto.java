package co.simplon.AlloPito.business.dto;

import co.simplon.AlloPito.persistence.entity.Patient;
import co.simplon.AlloPito.persistence.entity.Room;

public class BedDto {

	private int id_bed;

	private Patient patient;

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
