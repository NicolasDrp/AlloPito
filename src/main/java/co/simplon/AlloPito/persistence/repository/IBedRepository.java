package co.simplon.AlloPito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.AlloPito.persistence.entity.Bed;

@Repository
public interface IBedRepository extends JpaRepository<Bed, Integer>{

}
