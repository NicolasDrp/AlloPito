package co.simplon.allopito.business.dto;

/**
 * This class represents a DTO (Data Transfer Object) for Patient entities.
 */
public class PatientDto {

	/** The unique identifier of the patient. */
	private int idPatient;

	/** The last name of the patient. */
	private String lastnamePatient;

	/** The first name of the patient. */
	private String firstnamePatient;

	/** The social security number of the patient. */
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
	 * Returns the social security number of the patient.
	 *
	 * @return The social security number of the patient.
	 */
	public String getSecurityNumber() {
		return securityNumber;
	}

	/**
	 * Sets the social security number of the patient.
	 *
	 * @param securityNumber The social security number of the patient.
	 */
	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}
}
