package co.simplon.allopito.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Bed;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IBedRepository;
import co.simplon.allopito.persistence.repository.IRoomRepository;
import co.simplon.allopito.persistence.repository.IServiceRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IntegrationServiceTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private static ServiceDto service = new ServiceDto();
	private static ServiceDto serviceD = new ServiceDto();
	private static PatientDto patient = new PatientDto();

	@Autowired
	private IServiceRepository repo;

	@Autowired
	private IBedRepository repoBed;

	@Autowired
	private IRoomRepository repoRoom;

	@BeforeEach
	public void setUpTestData() {
		repo.deleteAll();

		Service service1 = new Service();
		service1.setNameService("service1");

		Service service2 = new Service();
		service2.setNameService("service2");

		repo.save(service1);
		repo.save(service2);
	}

	@BeforeAll
	static void init() {
		service.setNameService("service");

		serviceD.setIdService(100);
		serviceD.setNameService("service");
	}

	@Test
	@Order(1)
	void testGetServiceByIdEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/services/1",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(2)
	void testGetServicesEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/services",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(3)
	void testPostServiceEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.postForEntity("http://localhost:" + port + "/services",
					service, String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(4)
	void testDeleteServiceEndpoint() {
		try {
			this.restTemplate.delete("http://localhost:" + port + "/services", service, String.class);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	@Order(5)
	void testAffectPatientToServiceEndpoint() {
		try {
			
			List<Service> listServices = repo.findAll();
			Service service = new Service();
			service.setNameService("serviceP");

			Room room = new Room();
			room.setNumberRoom("S234");
			room.setService(listServices.get(0));

			Bed bed = new Bed();
			bed.setRoom(room);
			
			repo.save(service);
			repoRoom.save(room);
			repoBed.save(bed);
			
			System.out.println(listServices.get(0).getIdService());
			
			ResponseEntity<String> response = this.restTemplate
					.postForEntity("http://localhost:" + port + "/services/affect/"+listServices.get(0).getIdService(), patient, String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}
}
