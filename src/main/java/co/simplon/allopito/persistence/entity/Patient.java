package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This class represents a Patient entity in the system.
 */
@Entity
@Table(name = "patient")
public class Patient {

	/**
	 * The unique identifier of the patient.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_patient")
	private int idPatient;

	/**
	 * The last name of the patient.
	 */
	@Column(name = "lastname_patient", length = 50, nullable = false)
	private String lastnamePatient;

	/**
	 * The first name of the patient.
	 */
	@Column(name = "firstname_patient", length = 50, nullable = false)
	private String firstnamePatient;

	/**
	 * The security number of the patient.
	 */
	@Column(name = "security_number", length = 15, nullable = false, unique = true)
	private String securityNumber;

	/**
	 * Returns the unique identifier of the patient.
	 *
	 * @return The unique identifier of the patient.
	 */
	public int getIdPatient() {
		return idPatient;
	}

	/**
	 * Sets the unique identifier of the patient.
	 *
	 * @param idPatient The unique identifier of the patient.
	 */
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	/**
	 * Returns the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLastnamePatient() {
		return lastnamePatient;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastnamePatient The last name of the patient.
	 */
	public void setLastnamePatient(String lastnamePatient) {
		this.lastnamePatient = lastnamePatient;
	}

	/**
	 * Returns the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFirstnamePatient() {
		return firstnamePatient;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstnamePatient The first name of the patient.
	 */
	public void setFirstnamePatient(String firstnamePatient) {
		this.firstnamePatient = firstnamePatient;
	}

	/**
	 * Returns the security number of the patient.
	 *
	 * @return The security number of the patient.
	 */
	public String getSecurityNumber() {
		return securityNumber;
	}

	/**
	 * Sets the security number of the patient.
	 *
	 * @param securityNumber The security number of the patient.
	 */
	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}
}
