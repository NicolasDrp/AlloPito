package co.simplon.allopito.controller;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.service.patient.IPatientService;
import co.simplon.allopito.presentation.controller.patient.DeletePatientController;
import co.simplon.allopito.presentation.controller.patient.GetPatientByIdController;
import co.simplon.allopito.presentation.controller.patient.GetPatientsController;
import co.simplon.allopito.presentation.controller.patient.PostPatientController;

@ExtendWith(MockitoExtension.class)
class PatientControllerTest {

	@Mock
	private IPatientService service;

	@InjectMocks
	private GetPatientsController getPatientsController;

	@InjectMocks
	private GetPatientByIdController getPatientByIdController;

	@InjectMocks
	private PostPatientController postPatientController;

	@InjectMocks
	private DeletePatientController deletePatientController;

	PatientDto patientDto = new PatientDto();

	@Test
	void getPatientsController() {
		try {
			getPatientsController.getPatients();
			verify(service, times(1)).getPatients();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getPatientByIdController() {
		try {
			getPatientByIdController.getPatientById(1);
			verify(service, times(1)).getPatientById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postPatientController() {
		try {
			postPatientController.postPatient(patientDto);
			verify(service, times(1)).postPatient(patientDto);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deletePatientController() {
		try {
			deletePatientController.deletePatient(patientDto);
			verify(service, times(1)).deletePatient(patientDto);
		} catch (Exception e) {
			fail(e);
		}
	}

}
