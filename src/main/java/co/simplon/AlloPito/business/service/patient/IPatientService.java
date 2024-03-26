package co.simplon.AlloPito.business.service.patient;

import java.util.List;

import co.simplon.AlloPito.business.dto.PatientDto;

public interface IPatientService {

	public List<PatientDto> getPatients();

	public PatientDto getPatientById(final int id);

	public PatientDto postPatient(final PatientDto patientDto);

	public void deletePatient(final PatientDto patientDto);

}
