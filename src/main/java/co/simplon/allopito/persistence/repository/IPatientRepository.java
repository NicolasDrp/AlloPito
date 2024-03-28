package co.simplon.allopito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.Patient;

/**
 * This interface represents a repository for accessing Patient entities in the
 * system.
 */
@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
