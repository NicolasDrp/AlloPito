package co.simplon.AlloPito.business.dto;

public class BedDto {

	private int id_bed;

	private PatientDto patient;

	private RoomDto room;

	public int getId_bed() {
		return id_bed;
	}

	public void setId_bed(int id_bed) {
		this.id_bed = id_bed;
	}

	public PatientDto getPatient() {
		return patient;
	}

	public void setPatient(PatientDto patient) {
		this.patient = patient;
	}

	public RoomDto getRoom() {
		return room;
	}

	public void setRoom(RoomDto room) {
		this.room = room;
	}



}
