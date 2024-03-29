package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;

	@ManyToOne
	@JoinColumn(name = "id_service")
	private Service service;

	@Column(name = "lastname_user", length = 50, nullable = false)
	private String lastnameUser;

	@Column(name = "firstname_user", length = 50, nullable = false)
	private String firstnamePatient;

	@Column(name = "username", length = 50, nullable = false, unique = true)
	private String username;

	@Column(name = "password_user", length = 255, nullable = false)
	private String passwordUser;

	@Column(name = "role_user", length = 20, nullable = false)
	private String roleUSer;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getLastnameUser() {
		return lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public String getFirstnamePatient() {
		return firstnamePatient;
	}

	public void setFirstnamePatient(String firstnamePatient) {
		this.firstnamePatient = firstnamePatient;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getRoleUSer() {
		return roleUSer;
	}

	public void setRoleUSer(String roleUSer) {
		this.roleUSer = roleUSer;
	}

}
