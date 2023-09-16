package co.edu.jdc.IoTDataAPI.repository;

import co.edu.jdc.IoTDataAPI.model.entity.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoorRepository extends JpaRepository<Door, Integer> {

}
