package co.simplon.allopito.business.dto;

/**
 * This class represents a DTO (Data Transfer Object) for Service entities.
 */
public class ServiceDto {

	/** The unique identifier of the service. */
	private int idService;

	/** The name of the service. */
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
