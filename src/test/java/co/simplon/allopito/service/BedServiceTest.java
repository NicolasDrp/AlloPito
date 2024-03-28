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

import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.business.service.bed.BedServiceImpl;
import co.simplon.allopito.persistence.entity.Bed;
import co.simplon.allopito.persistence.entity.Patient;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;
import co.simplon.allopito.persistence.repository.IBedRepository;

@ExtendWith(MockitoExtension.class)
class BedServiceTest {

	@Mock
	private IBedRepository repo;

	@InjectMocks
	private BedServiceImpl service;

	private static Bed bed = new Bed();
	private static BedDto bedDto = new BedDto();
	private PatientDto patientDto = new PatientDto();

	@BeforeAll
	public static void init() {
		Room room = new Room();
		Service service = new Service();
		room.setService(service);
		bed.setRoom(room);

		RoomDto roomDto = new RoomDto();
		ServiceDto serviceDto = new ServiceDto();
		roomDto.setService(serviceDto);
		bedDto.setRoom(roomDto);
	}

	@Test
	void getBeds() {
		try {
			service.getBeds();
			verify(repo, times(1)).findAll();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getBedById() {
		try {
			when(repo.getReferenceById(1)).thenReturn(bed);
			service.getBedById(1);
			verify(repo, times(1)).getReferenceById(1);
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void postBed() {
		try {
			when(repo.save(any(Bed.class))).thenReturn(bed);
			service.postBed(bedDto);
			verify(repo, times(1)).save(any(Bed.class));
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void deleteBed() {
		try {
			service.deleteBed(bedDto);
			verify(repo, times(1)).delete(any(Bed.class));
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	void getEmptyBedsByService() {
		try {
			service.getEmptyBedsByService(1);
			verify(repo, times(1)).getEmptyBedsByService(1);
		} catch (Exception e) {
			fail(e);
		}
	}
	
	@Test
	void removePatientFromBed() {
		try {
			service.removePatientFromBed(patientDto);
			verify(repo, times(1)).removePatientFromBed(any(Patient.class));
		} catch (Exception e) {
			fail(e);
		}
	}

}
