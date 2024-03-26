package co.simplon.AlloPito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.AlloPito.business.dto.PatientDto;
import co.simplon.AlloPito.persistence.entity.Patient;

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

	public PatientDto convertEntityToDTo(final Patient patient) {
		if (patient == null) {
			throw new IllegalArgumentException("Patient ne peut pas être null");
		}
		final PatientDto result = new PatientDto();
		result.setId_patient(patient.getId_patient());
		result.setFirstname_patient(patient.getFirstname_patient());
		result.setLastname_patient(patient.getLastname_patient());
		result.setSecurity_number(patient.getSecurity_number());
		return result;
	}

	public List<PatientDto> convertListEntityToListDto(final List<Patient> list) {
		final List<PatientDto> listDto = new ArrayList<>();
		for (Patient patient : list) {
			listDto.add(convertEntityToDTo(patient));
		}
		return listDto;
	}

	public Patient convertDtoToEntity(final PatientDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("PatientDto ne peut pas être null");
		}
		final Patient result = new Patient();
		result.setId_patient(dto.getId_patient());
		result.setFirstname_patient(dto.getFirstname_patient());
		result.setLastname_patient(dto.getLastname_patient());
		result.setSecurity_number(dto.getSecurity_number());
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
