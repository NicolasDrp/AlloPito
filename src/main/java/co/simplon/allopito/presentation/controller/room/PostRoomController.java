package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

@RestController
@CrossOrigin
public class PostRoomController {

	private IRoomService service;

	@PostMapping("/rooms")
	public RoomDto postRoom(@RequestBody final RoomDto roomDto) {
		return service.postRoom(roomDto);
	}

	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}
}
