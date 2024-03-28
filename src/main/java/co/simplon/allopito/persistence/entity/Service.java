package co.simplon.allopito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This class represents a Service entity in the system.
 */
@Entity
@Table(name = "service")
public class Service {

	/**
	 * The unique identifier of the service.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idService;

	/**
	 * The name of the service.
	 */
	@Column(name = "name_service", length = 50, nullable = false)
	private String nameService;

	/**
	 * Returns the unique identifier of the service.
	 *
	 * @return The unique identifier of the service.
	 */
	public int getIdService() {
		return idService;
	}

	/**
	 * Sets the unique identifier of the service.
	 *
	 * @param idService The unique identifier of the service.
	 */
	public void setIdService(int idService) {
		this.idService = idService;
	}

	/**
	 * Returns the name of the service.
	 *
	 * @return The name of the service.
	 */
	public String getNameService() {
		return nameService;
	}

	/**
	 * Sets the name of the service.
	 *
	 * @param nameService The name of the service.
	 */
	public void setNameService(String nameService) {
		this.nameService = nameService;
	}
}
