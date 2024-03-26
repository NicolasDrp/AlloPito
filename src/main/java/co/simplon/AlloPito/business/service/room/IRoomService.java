package co.simplon.AlloPito.business.service.room;

import java.util.List;

import co.simplon.AlloPito.business.dto.RoomDto;

public interface IRoomService {

	public List<RoomDto> getRooms();

	public RoomDto getRoomById(final int id);

	public RoomDto postRoom(final RoomDto room);

	public void deleteRoom(final RoomDto room);

}
