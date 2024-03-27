package co.simplon.allopito.presentation.controller.room;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

@RestController
@CrossOrigin
public class GetRoomsController {
	
private IRoomService service;

	
	@GetMapping("/rooms")
	public List<RoomDto> getRooms(){
		return service.getRooms();
	}
	
	
	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}

}
