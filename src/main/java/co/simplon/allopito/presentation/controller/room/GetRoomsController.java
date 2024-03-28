package co.simplon.allopito.presentation.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;
import java.util.List;

/**
 * Controller class for handling requests to retrieve all rooms.
 */
@RestController
@CrossOrigin
public class GetRoomsController {

	private IRoomService service;

	/**
	 * Retrieves all rooms.
	 *
	 * @return The list of DTOs representing the retrieved rooms.
	 */
	@GetMapping("/rooms")
	public List<RoomDto> getRooms() {
		return service.getRooms();
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
