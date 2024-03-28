package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.persistence.entity.Room;

/**
 * This class provides methods to convert between Room entities and DTOs.
 */
@Component
public class RoomConvert {

	private static RoomConvert instance;

	private RoomConvert() {
	}

	/**
	 * Retrieves the singleton instance of RoomConvert.
	 *
	 * @return The singleton instance of RoomConvert.
	 */
	public static RoomConvert getInstance() {
		if (instance == null) {
			instance = new RoomConvert();
		}
		return instance;
	}

	/**
	 * Converts a RoomDto to a Room entity.
	 *
	 * @param dto The RoomDto to be converted.
	 * @return The corresponding Room entity.
	 * @throws IllegalArgumentException If the input dto is null.
	 */
	public Room convertDtoToEntity(final RoomDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("RoomDto cannot be null");
		}
		final Room room = new Room();
		room.setIdRoom(dto.getIdRoom());
		room.setNumberRoom(dto.getNumberRoom());
		room.setService(ServiceConvert.getInstance().convertDtoToEntity(dto.getService()));
		return room;
	}

	/**
	 * Converts a list of RoomDto objects to a list of Room entities.
	 *
	 * @param listDto The list of RoomDto objects to be converted.
	 * @return The corresponding list of Room entities.
	 */
	public List<Room> convertListDtoToListEntity(final List<RoomDto> listDto) {
		final List<Room> result = new ArrayList<>();
		for (RoomDto roomDto : listDto) {
			result.add(convertDtoToEntity(roomDto));
		}
		return result;
	}

	/**
	 * Converts a Room entity to a RoomDto.
	 *
	 * @param room The Room entity to be converted.
	 * @return The corresponding RoomDto.
	 * @throws IllegalArgumentException If the input room is null.
	 */
	public RoomDto convertEntityToDto(final Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null");
		}
		RoomDto result = new RoomDto();
		result.setIdRoom(room.getIdRoom());
		result.setNumberRoom(room.getNumberRoom());
		result.setService(ServiceConvert.getInstance().convertEntityToDto(room.getService()));
		return result;
	}

	/**
	 * Converts a list of Room entities to a list of RoomDto objects.
	 *
	 * @param list The list of Room entities to be converted.
	 * @return The corresponding list of RoomDto objects.
	 */
	public List<RoomDto> convertListEntityToListDto(List<Room> list) {
		final List<RoomDto> listDto = new ArrayList<>();
		for (Room room : list) {
			listDto.add(convertEntityToDto(room));
		}
		return listDto;
	}

}
