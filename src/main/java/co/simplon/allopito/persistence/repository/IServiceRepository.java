package co.simplon.allopito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.Service;

/**
 * This interface represents a repository for accessing Service entities in the
 * system.
 */
@Repository
public interface IServiceRepository extends JpaRepository<Service, Integer> {

}
