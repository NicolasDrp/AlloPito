package co.simplon.allopito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.User;

/**
 * This interface represents a repository for accessing User entities in the
 * system.
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
