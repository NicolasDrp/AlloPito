package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_patient")
	private int idPatient;

	@Column(name = "lastname_patient", length = 50, nullable = false)
	private String lastnamePatient;

	@Column(name = "firstname_patient", length = 50, nullable = false)
	private String firstnamePatient;

	@Column(name = "security_number", length = 15, nullable = false, unique = true)
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
