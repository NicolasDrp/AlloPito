package co.simplon.allopito.business.dto;

/**
 * This class represents a DTO (Data Transfer Object) for User entities.
 */
public class UserDto {

	/** The unique identifier of the user. */
	private int idUser;

	/** The service associated with the user. */
	private ServiceDto service;

	/** The last name of the user. */
	private String lastnameUser;

	/** The first name of the user. */
	private String firstnamePatient;

	/** The username of the user. */
	private String username;

	/** The password of the user. */
	private String password;

	/** The role of the user. */
	private String roleUSer;

	/**
	 * Returns the unique identifier of the user.
	 *
	 * @return The unique identifier of the user.
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * Sets the unique identifier of the user.
	 *
	 * @param idUser The unique identifier of the user.
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * Returns the service associated with the user.
	 *
	 * @return The service associated with the user.
	 */
	public ServiceDto getService() {
		return service;
	}

	/**
	 * Sets the service associated with the user.
	 *
	 * @param service The service associated with the user.
	 */
	public void setService(ServiceDto service) {
		this.service = service;
	}

	/**
	 * Returns the last name of the user.
	 *
	 * @return The last name of the user.
	 */
	public String getLastnameUser() {
		return lastnameUser;
	}

	/**
	 * Sets the last name of the user.
	 *
	 * @param lastnameUser The last name of the user.
	 */
	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	/**
	 * Returns the first name of the user.
	 *
	 * @return The first name of the user.
	 */
	public String getFirstnamePatient() {
		return firstnamePatient;
	}

	/**
	 * Sets the first name of the user.
	 *
	 * @param firstnamePatient The first name of the user.
	 */
	public void setFirstnamePatient(String firstnamePatient) {
		this.firstnamePatient = firstnamePatient;
	}

	/**
	 * Returns the username of the user.
	 *
	 * @return The username of the user.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username of the user.
	 *
	 * @param username The username of the user.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Returns the password of the user.
	 *
	 * @return The password of the user.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password of the user.
	 *
	 * @param password The password of the user.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the role of the user.
	 *
	 * @return The role of the user.
	 */
	public String getRoleUSer() {
		return roleUSer;
	}

	/**
	 * Sets the role of the user.
	 *
	 * @param roleUSer The role of the user.
	 */
	public void setRoleUSer(String roleUSer) {
		this.roleUSer = roleUSer;
	}
}
