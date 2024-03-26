package co.simplon.AlloPito.persistence.entity;

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
	private int id_patient;

	@Column(name = "lastname_patient", length = 50, nullable = false)
	private String lastname_patient;

	@Column(name = "firstname_patient", length = 50, nullable = false)
	private String firstname_patient;

	@Column(name = "security_number", length = 15, nullable = false, unique = true)
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
