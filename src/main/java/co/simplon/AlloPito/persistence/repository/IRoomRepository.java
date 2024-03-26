package co.simplon.AlloPito.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.AlloPito.persistence.entity.Room;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer>{

}
