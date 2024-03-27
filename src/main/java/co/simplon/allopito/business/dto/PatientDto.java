package co.simplon.allopito.business.dto;

public class PatientDto {

	private int id_patient;

	private String lastname_patient;

	private String firstname_patient;

	private String security_number;

	public int getId_patient() {
		return id_patient;
	}

	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}

	public String getLastname_patient() {
		return lastname_patient;
	}

	public void setLastname_patient(String lastname_patient) {
		this.lastname_patient = lastname_patient;
	}

	public String getFirstname_patient() {
		return firstname_patient;
	}

	public void setFirstname_patient(String firstname_patient) {
		this.firstname_patient = firstname_patient;
	}

	public String getSecurity_number() {
		return security_number;
	}

	public void setSecurity_number(String security_number) {
		this.security_number = security_number;
	}

}
