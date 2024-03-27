package co.simplon.allopito.business.service.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.allopito.business.convert.PatientConvert;
import co.simplon.allopito.business.dto.PatientDto;
import co.simplon.allopito.persistence.repository.IPatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {

	private IPatientRepository repo;

	@Override
	public List<PatientDto> getPatients() {
		return PatientConvert.getInstance().convertListEntityToListDto(repo.findAll());
	}

	@Override
	public PatientDto getPatientById(final int id) {
		return PatientConvert.getInstance().convertEntityToDto(repo.getReferenceById(id));
	}

	@Override
	public PatientDto postPatient(final PatientDto patientDto) {
		return PatientConvert.getInstance()
				.convertEntityToDto(repo.save(PatientConvert.getInstance().convertDtoToEntity(patientDto)));
	}

	@Override
	public void deletePatient(final PatientDto patientDto) {
		repo.delete(PatientConvert.getInstance().convertDtoToEntity(patientDto));
	}

	@Autowired
	public void setRepo(final IPatientRepository repo) {
		this.repo = repo;
	}

}
