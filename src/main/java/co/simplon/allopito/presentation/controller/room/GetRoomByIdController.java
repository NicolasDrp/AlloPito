package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

@RestController
@CrossOrigin
public class GetRoomByIdController {
	
	private IRoomService service;

	@GetMapping("/rooms/{id}")
	public RoomDto getRoomById(@PathVariable final int id) {
		return service.getRoomById(id);
	}

	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}

}
