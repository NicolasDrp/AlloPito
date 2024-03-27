package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.entity.Patient;

@Component
public class PatientConvert {

	private static PatientConvert instance;

	private PatientConvert() {
	}

	public static PatientConvert getInstance() {
		if (instance == null) {
			instance = new PatientConvert();
		}
		return instance;
	}

	public PatientDto convertEntityToDto(final Patient patient) {
		if (patient == null) {
			throw new IllegalArgumentException("Patient ne peut pas être null");
		}
		final PatientDto result = new PatientDto();
		result.setIdPatient(patient.getIdPatient());
		result.setFirstnamePatient(patient.getFirstnamePatient());
		result.setLastnamePatient(patient.getLastnamePatient());
		result.setSecurityNumber(patient.getSecurityNumber());
		return result;
	}

	public List<PatientDto> convertListEntityToListDto(final List<Patient> list) {
		final List<PatientDto> listDto = new ArrayList<>();
		for (Patient patient : list) {
			listDto.add(convertEntityToDto(patient));
		}
		return listDto;
	}

	public Patient convertDtoToEntity(final PatientDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("PatientDto ne peut pas être null");
		}
		final Patient result = new Patient();
		result.setIdPatient(dto.getIdPatient());
		result.setFirstnamePatient(dto.getFirstnamePatient());
		result.setLastnamePatient(dto.getLastnamePatient());
		result.setSecurityNumber(dto.getSecurityNumber());
		return result;
	}

	public List<Patient> convertListDtoToListEntity(final List<PatientDto> list) {
		final List<Patient> listEntity = new ArrayList<>();
		for (PatientDto patient : list) {
			listEntity.add(convertDtoToEntity(patient));
		}
		return listEntity;
	}

}
