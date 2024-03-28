package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;

/**
 * Controller class for handling requests to retrieve a room by its ID.
 */
@RestController
@CrossOrigin
public class GetRoomByIdController {

	private IRoomService service;

	/**
	 * Retrieves a room by its ID.
	 *
	 * @param id The ID of the room to retrieve.
	 * @return The DTO representing the retrieved room.
	 */
	@GetMapping("/rooms/{id}")
	public RoomDto getRoomById(@PathVariable final int id) {
		return service.getRoomById(id);
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
