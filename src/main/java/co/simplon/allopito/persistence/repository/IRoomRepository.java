package co.simplon.allopito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.allopito.persistence.entity.Room;

/**
 * This interface represents a repository for accessing Room entities in the
 * system.
 */
@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer> {

}
