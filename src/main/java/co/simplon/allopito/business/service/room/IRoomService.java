package co.simplon.allopito.business.service.room;

import java.util.List;

import co.simplon.allopito.business.dto.RoomDto;

public interface IRoomService {

	public List<RoomDto> getRooms();

	public RoomDto getRoomById(final int id);

	public RoomDto postRoom(final RoomDto room);

	public void deleteRoom(final RoomDto room);

}
