// package co.simplon.allopito.integration;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.fail;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.boot.test.web.server.LocalServerPort;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

// import co.simplon.allopito.business.convert.RoomConvert;
// import co.simplon.allopito.business.convert.ServiceConvert;
// import co.simplon.allopito.business.dto.BedDto;
// import co.simplon.allopito.business.dto.RoomDto;
// import co.simplon.allopito.business.dto.ServiceDto;
// import co.simplon.allopito.persistence.entity.Bed;
// import co.simplon.allopito.persistence.entity.Room;
// import co.simplon.allopito.persistence.entity.Service;
// import co.simplon.allopito.persistence.repository.IBedRepository;
// import co.simplon.allopito.persistence.repository.IRoomRepository;
// import co.simplon.allopito.persistence.repository.IServiceRepository;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// class IntegrationBedTest {

// 	@LocalServerPort
// 	private int port;

// 	@Autowired
// 	private TestRestTemplate restTemplate;

// 	private static BedDto bed = new BedDto();

// 	private static RoomDto room = new RoomDto();

// 	private static ServiceDto service = new ServiceDto();

// 	@Autowired
// 	private IBedRepository repo;

// 	@Autowired
// 	private IServiceRepository repoService;

// 	@Autowired
// 	private IRoomRepository repoRoom;

// 	@BeforeEach
// 	public void setUpTestData() {
// 		repo.deleteAll();
// 		repoRoom.deleteAll();

// 		Service service = new Service();
// 		service.setNameService("service");
// 		repoService.save(service);

// 		Room room1 = new Room();
// 		room1.setNumberRoom("548");
// 		room1.setService(service);
// 		repoRoom.save(room1);

// 		Bed bed1 = new Bed();
// 		bed1.setPatient(null);
// 		bed1.setRoom(room1);

// 		repo.save(bed1);
// 	}

// 	@Test
// 	@Order(1)
// 	void testGetBedByIdEndpoint() {
// 		try {
// 			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/beds/1",
// 					String.class);

// 			assertEquals(HttpStatus.OK, response.getStatusCode());
// 		} catch (Exception e) {
// 			fail(e);
// 		}
// 	}

// 	@Test
// 	@Order(2)
// 	void testGetBedsEndpoint() {
// 		try {
// 			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/beds",
// 					String.class);

// 			assertEquals(HttpStatus.OK, response.getStatusCode());
// 		} catch (Exception e) {
// 			fail(e);
// 		}
// 	}

// 	@Test
// 	@Order(3)
// 	void testPostBedEndpoint() {
// 		try {
// 			service.setNameService("service");
// 			Service serviceEntity = repoService.save(ServiceConvert.getInstance().convertDtoToEntity(service));
// 			room.setNumberRoom("4568");
// 			room.setService(ServiceConvert.getInstance().convertEntityToDto(serviceEntity));
// 			Room roomEntity = repoRoom.save(RoomConvert.getInstance().convertDtoToEntity(room));
// 			bed.setRoom(RoomConvert.getInstance().convertEntityToDto(roomEntity));
// 			ResponseEntity<String> response = this.restTemplate.postForEntity("http://localhost:" + port + "/beds", bed,
// 					String.class);

// 			assertEquals(HttpStatus.OK, response.getStatusCode());
// 		} catch (Exception e) {
// 			fail(e);
// 		}
// 	}

// 	@Test
// 	@Order(4)
// 	void testDeleteBedEndpoint() {
// 		try {
// 			this.restTemplate.delete("http://localhost:" + port + "/beds", bed, String.class);
// 		} catch (Exception e) {
// 			fail(e);
// 		}
// 	}
// }
