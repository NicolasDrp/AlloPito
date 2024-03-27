package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.persistence.entity.Room;

@Component
public class RoomConvert {

	private static RoomConvert instance;

	private RoomConvert() {
	}

	public static RoomConvert getInstance() {
		if (instance == null) {
			instance = new RoomConvert();
		}
		return instance;
	}

	public Room convertDtoToEntity(final RoomDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("RoomDto ne peut pas être null");
		}
		final Room room = new Room();
		room.setId_room(dto.getId_room());
		room.setNumber_room(dto.getNumber_room());
		room.setService(ServiceConvert.getInstance().convertDtoToEntity(dto.getService()));

		return room;
	}

	public List<Room> convertListDtoToListEntity(final List<RoomDto> listDto) {
		final List<Room> result = new ArrayList<>();
		for (RoomDto roomDto : listDto) {
			result.add(convertDtoToEntity(roomDto));
		}
		return result;
	}

	public RoomDto convertEntityToDto(final Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room ne peut pas être null");
		}
		RoomDto result = new RoomDto();
		result.setId_room(room.getId_room());
		result.setNumber_room(room.getNumber_room());
		result.setService(ServiceConvert.getInstance().convertEntityToDto(room.getService()));
		return result;
	}

	public List<RoomDto> convertListEntityToListDto(List<Room> list) {
		final List<RoomDto> listDto = new ArrayList<>();
		for (Room room : list) {
			listDto.add(convertEntityToDto(room));
		}
		return listDto;
	}

}
