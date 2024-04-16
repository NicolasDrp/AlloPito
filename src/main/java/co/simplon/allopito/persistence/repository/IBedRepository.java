package co.simplon.allopito.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.Bed;
import co.simplon.allopito.persistence.entity.Patient;
import co.simplon.allopito.persistence.entity.Room;
import jakarta.transaction.Transactional;

/**
 * This interface represents a repository for accessing Bed entities in the
 * system.
 */
@Repository
public interface IBedRepository extends JpaRepository<Bed, Integer> {

	/**
	 * Query to retrieve empty beds by service ID.
	 */
	@Query(BedQuery.GET_EMPTY_BED_BY_SERVICE)
	List<Bed> getEmptyBedsByService(final int idService);

	/**
	 * Query to remove a patient from a bed.
	 */
	@Modifying
	@Transactional
	@Query(BedQuery.REMOVE_PATIENT_FROM_BED)
	void removePatientFromBed(final Patient patient);
	
	/**
	 * Query to remove a room from a bed.
	 */
	@Modifying
	@Transactional
	@Query(BedQuery.REMOVE_ROOM_FROM_BED)
	void removeRoomFromBed(final Room room);

}
