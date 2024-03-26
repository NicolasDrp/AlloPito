package co.simplon.AlloPito.business.dto;

public class RoomDto {

	private int id_room;

	private String number_room;

	private ServiceDto service;

	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public String getNumber_room() {
		return number_room;
	}

	public void setNumber_room(String number_room) {
		this.number_room = number_room;
	}

	public ServiceDto getService() {
		return service;
	}

	public void setService(ServiceDto service) {
		this.service = service;
	}

}
