package co.simplon.AlloPito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.AlloPito.persistence.entity.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
