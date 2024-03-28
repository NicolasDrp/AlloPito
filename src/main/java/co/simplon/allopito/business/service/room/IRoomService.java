package co.simplon.allopito.business.service.room;

import java.util.List;

import co.simplon.allopito.business.dto.RoomDto;

/**
 * This interface defines the room-related services.
 */
public interface IRoomService {

	/**
	 * Retrieves a list of all rooms.
	 *
	 * @return A list of all rooms.
	 */
	public List<RoomDto> getRooms();

	/**
	 * Retrieves a room by its unique identifier.
	 *
	 * @param id The unique identifier of the room.
	 * @return The room DTO corresponding to the given identifier.
	 */
	public RoomDto getRoomById(final int id);

	/**
	 * Creates a new room.
	 *
	 * @param room The DTO representing the room to be created.
	 * @return The DTO representing the newly created room.
	 */
	public RoomDto postRoom(final RoomDto room);

	/**
	 * Deletes a room.
	 *
	 * @param room The DTO representing the room to be deleted.
	 */
	public void deleteRoom(final RoomDto room);

}
