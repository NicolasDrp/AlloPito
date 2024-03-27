package co.simplon.allopito.business.dto;

public class BedDto {

	private int idBed;

	private PatientDto patient;

	private RoomDto room;

	public int getIdBed() {
		return idBed;
	}

	public void setIdBed(int idBed) {
		this.idBed = idBed;
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
