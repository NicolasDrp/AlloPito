package co.simplon.allopito.business.service.patient;

import java.util.List;

import co.simplon.allopito.business.dto.PatientDto;

public interface IPatientService {

	public List<PatientDto> getPatients();

	public PatientDto getPatientById(final int id);

	public PatientDto postPatient(final PatientDto patientDto);

	public void deletePatient(final PatientDto patientDto);

}
