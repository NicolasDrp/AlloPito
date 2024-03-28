package co.simplon.allopito.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.service.room.IRoomService;
import co.simplon.allopito.presentation.controller.room.DeleteRoomController;
import co.simplon.allopito.presentation.controller.room.GetRoomByIdController;
import co.simplon.allopito.presentation.controller.room.GetRoomsController;
import co.simplon.allopito.presentation.controller.room.PostRoomController;

@ExtendWith(MockitoExtension.class)
class RoomControllerTest {

	@Mock
	private IRoomService service;

	@InjectMocks
	private GetRoomsController getRoomsController;

	@InjectMocks
	private GetRoomByIdController getRoomByIdController;

	@InjectMocks
	private PostRoomController postRoomController;

	@InjectMocks
	private DeleteRoomController deleteRoomController;

	RoomDto roomDto = new RoomDto();

	@Test
	void getRoomsController() {
		try {
			getRoomsController.getRooms();
			verify(service, times(1)).getRooms();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getRoomByIdController() {
		try {
			getRoomByIdController.getRoomById(1);
			verify(service, times(1)).getRoomById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postRoomController() {
		try {
			postRoomController.postRoom(roomDto);
			verify(service, times(1)).postRoom(roomDto);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteRoomController() {
		try {
			deleteRoomController.deleteRoom(roomDto);
			verify(service, times(1)).deleteRoom(roomDto);
		} catch (Exception e) {
			fail(e);
		}
	}

}
