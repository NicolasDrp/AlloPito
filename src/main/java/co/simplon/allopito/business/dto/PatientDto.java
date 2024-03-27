package co.simplon.allopito.business.dto;

public class PatientDto {

	private int idPatient;

	private String lastnamePatient;

	private String firstnamePatient;

	private String securityNumber;

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getLastnamePatient() {
		return lastnamePatient;
	}

	public void setLastnamePatient(String lastnamePatient) {
		this.lastnamePatient = lastnamePatient;
	}

	public String getFirstnamePatient() {
		return firstnamePatient;
	}

	public void setFirstnamePatient(String firstnamePatient) {
		this.firstnamePatient = firstnamePatient;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}

}
