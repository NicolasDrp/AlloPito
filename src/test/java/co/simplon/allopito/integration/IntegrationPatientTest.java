package co.simplon.allopito.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.entity.Patient;
import co.simplon.allopito.persistence.repository.IPatientRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IntegrationPatientTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private static PatientDto patient = new PatientDto();
	private static PatientDto patientD = new PatientDto();

	@Autowired
	private IPatientRepository repo;

	@BeforeEach
	public void setUpTestData() {
		repo.deleteAll();
		Patient patient1 = new Patient();
		patient1.setFirstnamePatient("prenom1");
		patient1.setLastnamePatient("nom1");
		patient1.setSecurityNumber("1234456778902");

		Patient patient2 = new Patient();
		patient2.setFirstnamePatient("prenom2");
		patient2.setLastnamePatient("nom2");
		patient2.setSecurityNumber("2346534277643");

		repo.save(patient1);
		repo.save(patient2);
	}

	@BeforeAll
	static void init() {
		patient.setFirstnamePatient("Yoan");
		patient.setLastnamePatient("Bor");
		patient.setSecurityNumber("124314236");

		patientD.setIdPatient(100);
		patientD.setFirstnamePatient("Yoan");
		patientD.setLastnamePatient("Bor");
		patientD.setSecurityNumber("124314236");
	}

	@Test
	void testGetPatientsEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/patients",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void testGetPatientByIdEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:" + port + "/patients/1",
					String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void testPostPatientEndpoint() {
		try {
			ResponseEntity<String> response = this.restTemplate.postForEntity("http://localhost:" + port + "/patients",
					patient, String.class);

			assertEquals(HttpStatus.OK, response.getStatusCode());
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void testDeletePatientEndpoint() {
		try {
			this.restTemplate.delete("http://localhost:" + port + "/patients", patient, String.class);
		} catch (Exception e) {
			fail(e);
		}
	}

}
