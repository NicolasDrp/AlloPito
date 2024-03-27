package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

@RestController
@CrossOrigin
public class DeleteRoomController {
	
	private IRoomService service;

	@DeleteMapping("/rooms")
	public void deleteRoom(@RequestBody final RoomDto roomDto) {
		service.deleteRoom(roomDto);
	}

	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}

}
