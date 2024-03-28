package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

/**
 * Controller class for handling requests to delete rooms.
 */
@RestController
@CrossOrigin
public class DeleteRoomController {

	private IRoomService service;

	/**
	 * Deletes a room.
	 *
	 * @param roomDto The DTO representing the room to be deleted.
	 */
	@DeleteMapping("/rooms")
	public void deleteRoom(@RequestBody final RoomDto roomDto) {
		service.deleteRoom(roomDto);
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
