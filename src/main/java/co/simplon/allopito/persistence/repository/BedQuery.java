package co.simplon.allopito.persistence.repository;

/**
 * This class contains queries related to Bed entities.
 */
public class BedQuery {

	/**
	 * Private constructor to prevent instantiation of this class.
	 */
	private BedQuery() {

	}

	/**
	 * Query to retrieve empty beds by service ID.
	 */
	public static final String GET_EMPTY_BED_BY_SERVICE = "SELECT b FROM Bed b JOIN Room r on b.room = r WHERE b.patient IS NULL AND r.service.idService = :idService";

	/**
	 * Query to remove a patient from a bed.
	 */
	public static final String REMOVE_PATIENT_FROM_BED = "UPDATE Bed b SET b.patient = NULL WHERE b.patient = :patient";
	
	
	/**
	 * Query to remove a room from a bed.
	 */
	public static final String REMOVE_ROOM_FROM_BED = "UPDATE Bed b SET b.room = NULL WHERE b.room = :room";
}