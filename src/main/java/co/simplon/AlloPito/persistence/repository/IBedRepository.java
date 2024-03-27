package co.simplon.AlloPito.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.simplon.AlloPito.persistence.entity.Bed;

@Repository
public interface IBedRepository extends JpaRepository<Bed, Integer> {

	@Query(BedQuery.GET_EMPTY_BED_BY_SERVICE)
	List<Bed> getEmptyBedsByService(final int idService);

}
