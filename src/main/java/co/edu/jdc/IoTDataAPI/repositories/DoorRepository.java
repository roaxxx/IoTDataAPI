package co.edu.jdc.IoTDataAPI.repositories;

import co.edu.jdc.IoTDataAPI.models.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoorRepository extends JpaRepository<Door, Integer> {

}
