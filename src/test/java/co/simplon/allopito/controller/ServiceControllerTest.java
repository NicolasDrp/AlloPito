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
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.IServiceService;
import co.simplon.allopito.presentation.controller.service.AffectPatientToServiceController;
import co.simplon.allopito.presentation.controller.service.DeleteServiceController;
import co.simplon.allopito.presentation.controller.service.GetServiceByIdController;
import co.simplon.allopito.presentation.controller.service.GetServicesController;
import co.simplon.allopito.presentation.controller.service.PostServiceController;

@ExtendWith(MockitoExtension.class)
class ServiceControllerTest {
	
	@Mock
	private IServiceService service;

	@InjectMocks
	private GetServicesController getServicesController;

	@InjectMocks
	private GetServiceByIdController getServiceByIdController;

	@InjectMocks
	private PostServiceController postServiceController;

	@InjectMocks
	private DeleteServiceController deleteServiceController;
	
	@InjectMocks
	private AffectPatientToServiceController affectPatientToServiceController;

	ServiceDto serviceDto = new ServiceDto();
	PatientDto patientDto = new PatientDto();

	@Test
	void getServicesController() {
		try {
			getServicesController.getServices();
			verify(service, times(1)).getServices();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getServiceByIdController() {
		try {
			getServiceByIdController.getServiceById(1);
			verify(service, times(1)).getServiceById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postServiceController() {
		try {
			postServiceController.postService(serviceDto);
			verify(service, times(1)).postService(serviceDto);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteServiceController() {
		try {
			deleteServiceController.deleteService(serviceDto);
			verify(service, times(1)).deleteService(serviceDto);
		} catch (Exception e) {
			fail(e);
		}
	}
	
	@Test
	void affectPatientToServiceController() {
		try {
			affectPatientToServiceController.affectPatientToService(1,patientDto);
			verify(service, times(1)).affectPatientToService(1, patientDto);
		} catch (Exception e) {
			fail(e);
		}
	}

}
