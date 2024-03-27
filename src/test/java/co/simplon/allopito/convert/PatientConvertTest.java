package co.simplon.allopito.convert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import co.simplon.allopito.business.convert.PatientConvert;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.entity.Patient;

class PatientConvertTest {

	private int idPatient = 1;

	private String lastnamePatient = "Dalle";

	private String firstnamePatient = "Alexis";

	private String securityNumber = "123456789012345";

	@Test
	void convertEntityToDto() {
		Patient patient = new Patient();
		patient.setIdPatient(idPatient);
		patient.setFirstnamePatient(firstnamePatient);
		patient.setLastnamePatient(lastnamePatient);
		patient.setSecurityNumber(securityNumber);

		PatientDto dto = PatientConvert.getInstance().convertEntityToDto(patient);

		assertEquals(patient.getIdPatient(), dto.getIdPatient());
		assertEquals(patient.getFirstnamePatient(), dto.getFirstnamePatient());
		assertEquals(patient.getLastnamePatient(), dto.getLastnamePatient());
		assertEquals(patient.getSecurityNumber(), dto.getSecurityNumber());
	}

	@Test
	void convertEntityToDtoException() {
		assertThrows(IllegalArgumentException.class, () -> PatientConvert.getInstance().convertEntityToDto(null));
	}

	@Test
	void convertListEntityToListDto() {
		List<Patient> listPatient = new ArrayList<>();
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		patient1.setIdPatient(1);
		patient2.setIdPatient(2);
		listPatient.add(patient1);
		listPatient.add(patient2);

		List<PatientDto> listDto = PatientConvert.getInstance().convertListEntityToListDto(listPatient);
		assertEquals(listDto.size(), listPatient.size());
	}

	@Test
	void convertDtoToEntity() {
		PatientDto dto = new PatientDto();
		dto.setIdPatient(idPatient);
		dto.setFirstnamePatient(firstnamePatient);
		dto.setLastnamePatient(lastnamePatient);
		dto.setSecurityNumber(securityNumber);

		Patient patient = PatientConvert.getInstance().convertDtoToEntity(dto);

		assertEquals(dto.getIdPatient(), patient.getIdPatient());
		assertEquals(dto.getFirstnamePatient(), patient.getFirstnamePatient());
		assertEquals(dto.getLastnamePatient(), patient.getLastnamePatient());
		assertEquals(dto.getSecurityNumber(), patient.getSecurityNumber());
	}

	@Test
	void convertDtoToEntityException() {
		assertThrows(IllegalArgumentException.class, () -> PatientConvert.getInstance().convertDtoToEntity(null));
	}

	@Test
	void convertListDtoToListEntity() {
		List<PatientDto> listDto = new ArrayList<>();
		PatientDto patient1 = new PatientDto();
		PatientDto patient2 = new PatientDto();
		patient1.setIdPatient(1);
		patient2.setIdPatient(2);
		listDto.add(patient1);
		listDto.add(patient2);

		List<Patient> listPatient = PatientConvert.getInstance().convertListDtoToListEntity(listDto);
		assertEquals(listPatient.size(), listDto.size());
	}
}
