package co.simplon.allopito.business.dto;

public class RoomDto {

	private int idRoom;

	private String numberRoom;

	private ServiceDto service;

	public int getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}

	public String getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

}
