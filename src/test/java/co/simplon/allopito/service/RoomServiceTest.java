package co.simplon.allopito.service;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.bed.IBedService;
import co.simplon.allopito.business.service.room.RoomServiceImpl;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IRoomRepository;

@ExtendWith(MockitoExtension.class)
class RoomServiceTest {

	@Mock
	private IRoomRepository repo;
	
	@Mock
    private IBedService bedService;

	@InjectMocks
	private RoomServiceImpl service;

	private static Room room = new Room();
	private static RoomDto roomDto = new RoomDto();
	
	@BeforeAll
	public static void init() {
		Service service = new Service();
		room.setService(service);

		ServiceDto serviceDto = new ServiceDto();
		roomDto.setService(serviceDto);
	}

	@Test
	void getRooms() {
		try {
			service.getRooms();
			verify(repo, times(1)).findAll();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getRoomById() {
		try {
			when(repo.getReferenceById(1)).thenReturn(room);
			service.getRoomById(1);
			verify(repo, times(1)).getReferenceById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postRoom() {
		try {
			when(repo.save(any(Room.class))).thenReturn(room);
			service.postRoom(roomDto);
			verify(repo, times(1)).save(any(Room.class));
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteRoom() {
		try {
			service.deleteRoom(roomDto);
			verify(repo, times(1)).delete(any(Room.class));
		} catch (Exception e) {
			fail(e);
		}
	}

}
