package co.simplon.allopito.business.service.patient;

import java.util.List;

import co.simplon.allopito.business.dto.PatientDto;

/**
 * This interface defines the patient-related services.
 */
public interface IPatientService {

	/**
	 * Retrieves a list of all patients.
	 *
	 * @return A list of all patients.
	 */
	public List<PatientDto> getPatients();

	/**
	 * Retrieves a patient by their unique identifier.
	 *
	 * @param id The unique identifier of the patient.
	 * @return The patient DTO corresponding to the given identifier.
	 */
	public PatientDto getPatientById(final int id);

	/**
	 * Creates a new patient.
	 *
	 * @param patientDto The DTO representing the patient to be created.
	 * @return The DTO representing the newly created patient.
	 */
	public PatientDto postPatient(final PatientDto patientDto);

	/**
	 * Deletes a patient.
	 *
	 * @param patientDto The DTO representing the patient to be deleted.
	 */
	public void deletePatient(final PatientDto patientDto);
}
