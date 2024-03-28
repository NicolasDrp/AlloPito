package co.simplon.allopito.business.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.entity.Patient;

/**
 * This class provides methods to convert between Patient entities and DTOs.
 */
@Component
public class PatientConvert {

	private static PatientConvert instance;

	private PatientConvert() {
	}

	/**
	 * Retrieves the singleton instance of PatientConvert.
	 *
	 * @return The singleton instance of PatientConvert.
	 */
	public static PatientConvert getInstance() {
		if (instance == null) {
			instance = new PatientConvert();
		}
		return instance;
	}

	/**
	 * Converts a Patient entity to a PatientDto.
	 *
	 * @param patient The Patient entity to be converted.
	 * @return The corresponding PatientDto.
	 * @throws IllegalArgumentException If the input patient is null.
	 */
	public PatientDto convertEntityToDto(final Patient patient) {
		if (patient == null) {
			throw new IllegalArgumentException("Patient cannot be null");
		}
		final PatientDto result = new PatientDto();
		result.setIdPatient(patient.getIdPatient());
		result.setFirstnamePatient(patient.getFirstnamePatient());
		result.setLastnamePatient(patient.getLastnamePatient());
		result.setSecurityNumber(patient.getSecurityNumber());
		return result;
	}

	/**
	 * Converts a list of Patient entities to a list of PatientDto objects.
	 *
	 * @param list The list of Patient entities to be converted.
	 * @return The corresponding list of PatientDto objects.
	 */
	public List<PatientDto> convertListEntityToListDto(final List<Patient> list) {
		final List<PatientDto> listDto = new ArrayList<>();
		for (Patient patient : list) {
			listDto.add(convertEntityToDto(patient));
		}
		return listDto;
	}

	/**
	 * Converts a PatientDto to a Patient entity.
	 *
	 * @param dto The PatientDto to be converted.
	 * @return The corresponding Patient entity.
	 * @throws IllegalArgumentException If the input dto is null.
	 */
	public Patient convertDtoToEntity(final PatientDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("PatientDto cannot be null");
		}
		final Patient result = new Patient();
		result.setIdPatient(dto.getIdPatient());
		result.setFirstnamePatient(dto.getFirstnamePatient());
		result.setLastnamePatient(dto.getLastnamePatient());
		result.setSecurityNumber(dto.getSecurityNumber());
		return result;
	}

	/**
	 * Converts a list of PatientDto objects to a list of Patient entities.
	 *
	 * @param list The list of PatientDto objects to be converted.
	 * @return The corresponding list of Patient entities.
	 */
	public List<Patient> convertListDtoToListEntity(final List<PatientDto> list) {
		final List<Patient> listEntity = new ArrayList<>();
		for (PatientDto patient : list) {
			listEntity.add(convertDtoToEntity(patient));
		}
		return listEntity;
	}

}
