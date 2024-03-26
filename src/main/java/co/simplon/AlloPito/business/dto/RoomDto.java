package co.simplon.AlloPito.business.dto;

import co.simplon.AlloPito.persistence.entity.Service;

public class RoomDto {

	private int id_room;

	private Service service;

	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	

}
