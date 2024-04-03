package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

/**
 * Controller class for handling requests to update rooms.
 */
@RestController
@CrossOrigin
public class PutRoomController {

	private IRoomService service;

	/**
	 * Update a room.
	 *
	 * @param roomDto The DTO representing the room to be updated.
	 * @return The DTO representing the updated room.
	 */
	@PutMapping("/rooms")
	public RoomDto putRoom(@RequestBody final RoomDto roomDto) {
		return service.postRoom(roomDto);
	}

	/**
	 * Sets the room service for this controller.
	 *
	 * @param service The room service to be set.
	 */
	@Autowired
	public void setService(IRoomService service) {
		this.service = service;
	}

}
