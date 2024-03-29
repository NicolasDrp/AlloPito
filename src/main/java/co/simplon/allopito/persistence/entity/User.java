package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents a User entity in the system.
 */
@Entity
@Table(name = "user")
public class User {

	/**
	 * The unique identifier of the user.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;

	/**
	 * The service associated with the user.
	 */
	@ManyToOne
	@JoinColumn(name = "id_service")
	private Service service;

	/**
	 * The last name of the user.
	 */
	@Column(name = "lastname_user", length = 50, nullable = false)
	private String lastnameUser;

	/**
	 * The first name of the user.
	 */
	@Column(name = "firstname_user", length = 50, nullable = false)
	private String firstnamePatient;

	/**
	 * The username of the user.
	 */
	@Column(name = "username", length = 50, nullable = false, unique = true)
	private String username;

	/**
	 * The password of the user.
	 */
	@Column(name = "password_user", length = 255, nullable = false)
	private String passwordUser;

	/**
	 * The role of the user.
	 */
	@Column(name = "role_user", length = 20, nullable = false)
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
	public Service getService() {
		return service;
	}

	/**
	 * Sets the service associated with the user.
	 *
	 * @param service The service associated with the user.
	 */
	public void setService(Service service) {
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
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * Sets the password of the user.
	 *
	 * @param passwordUser The password of the user.
	 */
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
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
