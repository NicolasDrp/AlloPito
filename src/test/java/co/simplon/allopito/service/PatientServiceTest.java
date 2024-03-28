package co.simplon.allopito.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.patient.IPatientService;
import co.simplon.allopito.business.service.patient.PatientServiceImpl;
import co.simplon.allopito.persistence.entity.Patient;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IPatientRepository;

@ExtendWith(MockitoExtension.class)
class PatientServiceTest {

	@Mock
	private IPatientRepository repo;

	@InjectMocks
	private PatientServiceImpl service;

	private Patient patient = new Patient();
	private PatientDto patientDto = new PatientDto();

	@Test
	void getPatients() {
		try {
			service.getPatients();
			verify(repo, times(1)).findAll();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getPatientById() {
		try {
			when(repo.getReferenceById(1)).thenReturn(patient);
			service.getPatientById(1);
			verify(repo, times(1)).getReferenceById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postPatient() {
		try {
			when(repo.save(any(Patient.class))).thenReturn(patient);
			service.postPatient(patientDto);
			verify(repo, times(1)).save(any(Patient.class));
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deletePatient() {
		try {
			service.deletePatient(patientDto);
			verify(repo, times(1)).delete(any(Patient.class));
		} catch (Exception e) {
			fail(e);
		}
	}

}
