package co.simplon.allopito.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import co.simplon.allopito.business.convert.BedConvert;
import co.simplon.allopito.business.dto.BedDto;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.business.dto.RoomDto;
import co.simplon.allopito.business.dto.ServiceDto;
import co.simplon.allopito.persistence.entity.Bed;
import co.simplon.allopito.persistence.entity.Patient;
import co.simplon.allopito.persistence.entity.Room;
import co.simplon.allopito.persistence.entity.Service;

class BedConvertTest {

	private int idBed = 1;

	private PatientDto patientDto = new PatientDto();

	private Patient patient = new Patient();

	private static RoomDto roomDto = new RoomDto();

	private static Room room = new Room();

	@BeforeAll
	public static void init() {
		Service service = new Service();
		room.setService(service);

		ServiceDto serviceDto = new ServiceDto();
		roomDto.setService(serviceDto);
	}

	@Test
	void convertEntityToDto() {
		Bed bed = new Bed();
		bed.setIdBed(idBed);
		bed.setRoom(room);
		bed.setPatient(patient);

		BedDto dto = BedConvert.getInstance().convertEntityToDto(bed);

		assertEquals(bed.getIdBed(), dto.getIdBed());
		assertEquals(bed.getRoom().getIdRoom(), dto.getRoom().getIdRoom());
		assertEquals(bed.getPatient().getIdPatient(), dto.getPatient().getIdPatient());
	}

	@Test
	void convertEntityToDtoException() {
		assertThrows(IllegalArgumentException.class, () -> BedConvert.getInstance().convertEntityToDto(null));
	}

	@Test
	void convertListEntityToListDto() {
		List<Bed> listBed = new ArrayList<>();
		Bed bed1 = new Bed();
		Bed bed2 = new Bed();
		bed1.setIdBed(1);
		bed1.setRoom(room);
		bed2.setIdBed(2);
		bed2.setRoom(room);
		listBed.add(bed1);
		listBed.add(bed2);

		List<BedDto> listDto = BedConvert.getInstance().convertListEntityToListDto(listBed);
		assertEquals(listDto.size(), listBed.size());
	}

	@Test
	void convertDtoToEntity() {
		BedDto dto = new BedDto();
		dto.setIdBed(idBed);
		dto.setPatient(patientDto);
		dto.setRoom(roomDto);

		Bed bed = BedConvert.getInstance().convertDtoToEntity(dto);

		assertEquals(dto.getIdBed(), bed.getIdBed());
		assertEquals(dto.getPatient().getIdPatient(), bed.getPatient().getIdPatient());
		assertEquals(dto.getRoom().getIdRoom(), bed.getRoom().getIdRoom());
	}

	@Test
	void convertDtoToEntityException() {
		assertThrows(IllegalArgumentException.class, () -> BedConvert.getInstance().convertDtoToEntity(null));
	}

	@Test
	void convertListDtoToListEntity() {
		List<BedDto> listDto = new ArrayList<>();
		BedDto bed1 = new BedDto();
		BedDto bed2 = new BedDto();
		bed1.setIdBed(1);
		bed1.setRoom(roomDto);
		bed2.setIdBed(2);
		bed2.setRoom(roomDto);
		listDto.add(bed1);
		listDto.add(bed2);

		List<Bed> listBed = BedConvert.getInstance().convertListDtoToListEntity(listDto);
		assertEquals(listBed.size(), listDto.size());
	}

}
