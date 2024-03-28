package co.simplon.allopito.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.Bed;
import co.simplon.allopito.persistence.entity.Patient;

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
	@Query(BedQuery.REMOVE_PATIENT_FROM_BED)
	List<Bed> removePatientFromBed(final Patient patient);

}
