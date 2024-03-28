package co.simplon.allopito.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import co.simplon.allopito.business.convert.RoomConvert;
import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;

class RoomConvertTest {

	private int idRoom = 1;

	private String numberRoom = "U341";

	private ServiceDto serviceDto = new ServiceDto();

	private Service service = new Service();

	@Test
	void convertEntityToDto() {
		Room room = new Room();
		room.setIdRoom(idRoom);
		room.setNumberRoom(numberRoom);
		room.setService(service);

		RoomDto dto = RoomConvert.getInstance().convertEntityToDto(room);

		assertEquals(room.getIdRoom(), dto.getIdRoom());
		assertEquals(room.getNumberRoom(), dto.getNumberRoom());
		assertEquals(room.getService().getIdService(), dto.getService().getIdService());
	}

	@Test
	void convertEntityToDtoException() {
		assertThrows(IllegalArgumentException.class, () -> RoomConvert.getInstance().convertEntityToDto(null));
	}

	@Test
	void convertListEntityToListDto() {
		List<Room> listRoom = new ArrayList<>();
		Room room1 = new Room();
		Room room2 = new Room();
		room1.setIdRoom(1);
		room1.setService(service);
		room2.setIdRoom(2);
		room2.setService(service);
		listRoom.add(room1);
		listRoom.add(room2);

		List<RoomDto> listDto = RoomConvert.getInstance().convertListEntityToListDto(listRoom);
		assertEquals(listDto.size(), listRoom.size());
	}

	@Test
	void convertDtoToEntity() {
		RoomDto dto = new RoomDto();
		dto.setIdRoom(idRoom);
		dto.setNumberRoom(numberRoom);
		dto.setService(serviceDto);

		Room room = RoomConvert.getInstance().convertDtoToEntity(dto);

		assertEquals(dto.getIdRoom(), room.getIdRoom());
		assertEquals(dto.getNumberRoom(), room.getNumberRoom());
		assertEquals(dto.getService().getIdService(), room.getService().getIdService());
	}

	@Test
	void convertDtoToEntityException() {
		assertThrows(IllegalArgumentException.class, () -> RoomConvert.getInstance().convertDtoToEntity(null));
	}

	@Test
	void convertListDtoToListEntity() {
		List<RoomDto> listDto = new ArrayList<>();
		RoomDto room1 = new RoomDto();
		RoomDto room2 = new RoomDto();
		room1.setIdRoom(1);
		room1.setService(serviceDto);
		room2.setIdRoom(2);
		room2.setService(serviceDto);
		listDto.add(room1);
		listDto.add(room2);

		List<Room> listRoom = RoomConvert.getInstance().convertListDtoToListEntity(listDto);
		assertEquals(listRoom.size(), listDto.size());
	}

}
