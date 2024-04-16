package co.simplon.allopito.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IServiceRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IntegrationServiceTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private static ServiceDto service = new ServiceDto();
	
	@Autowired
	private IServiceRepository repo;

	@BeforeEach
	public void setUpTestData() {
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
}
