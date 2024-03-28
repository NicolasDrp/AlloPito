package co.simplon.allopito.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.allopito.business.convert.ServiceConvert;
import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IRoomRepository;
import co.simplon.allopito.persistence.repository.IServiceRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationRoomTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private static RoomDto room = new RoomDto();

	private static ServiceDto service = new ServiceDto();

	@Autowired
	private IRoomRepository repo;

	@Autowired
	private IServiceRepository repoService;

	@BeforeEach
	public void setUpTestData() {
		repo.deleteAll();
		repoService.deleteAll();

		Service service = new Service();
		service.setNameService("service");
		repoService.save(service);

		Room room1 = new Room();
		room1.setNumberRoom("4568");
		room1.setService(service);

		repo.save(room1);
	}

	@Test
	@Order(1)
	void testGetRoomByIdEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/rooms/1",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(2)
	void testGetRoomsEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/rooms",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(3)
	void testPostRoomEndpoint() {
		try {
			service.setNameService("service");
			Service serviceEntity = repoService.save(ServiceConvert.getInstance().convertDtoToEntity(service));
			room.setNumberRoom("4568");
			room.setService(ServiceConvert.getInstance().convertEntityToDto(serviceEntity));
			ResponseEntity<String> response = this.restTemplate.postForEntity("http://localhost:" + port + "/rooms",
					room, String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(4)
	void testDeleteRoomEndpoint() {
		try {
			this.restTemplate.delete("http://localhost:" + port + "/rooms", room, String.class);
		} catch (Exception e) {
			fail(e);
		}
	}
}
