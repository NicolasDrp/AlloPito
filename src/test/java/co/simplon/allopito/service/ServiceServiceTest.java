package co.simplon.allopito.service;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.service.ServiceServiceImpl;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IServiceRepository;

@ExtendWith(MockitoExtension.class)
class ServiceServiceTest {

	@Mock
	private IServiceRepository repo;

	@InjectMocks
	private ServiceServiceImpl service;

	private Service serviceEntity = new Service();
	private ServiceDto serviceDto = new ServiceDto();

	@Test
	void getServices() {
		try {
			service.getServices();
			verify(repo, times(1)).findAll();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getServiceById() {
		try {
			when(repo.getReferenceById(1)).thenReturn(serviceEntity);
			service.getServiceById(1);
			verify(repo, times(1)).getReferenceById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postService() {
		try {
			when(repo.save(any(Service.class))).thenReturn(serviceEntity);
			service.postService(serviceDto);
			verify(repo, times(1)).save(any(Service.class));
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteService() {
		try {
			service.deleteService(serviceDto);
			verify(repo, times(1)).delete(any(Service.class));
		} catch (Exception e) {
			fail(e);
		}
	}

}
