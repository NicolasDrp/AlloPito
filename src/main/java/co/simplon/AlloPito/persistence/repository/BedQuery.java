package co.simplon.AlloPito.persistence.repository;

public class BedQuery {
	
	public static final String GET_EMPTY_BED_BY_SERVICE = "SELECT b FROM Bed b JOIN Room r on b.room = r WHERE b.patient IS NULL AND r.service.id_service = :idService";

}
