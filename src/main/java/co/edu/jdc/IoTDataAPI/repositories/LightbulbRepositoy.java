package co.edu.jdc.IoTDataAPI.repositories;

import co.edu.jdc.IoTDataAPI.models.Lightbulb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightbulbRepositoy  extends JpaRepository<Lightbulb,Integer> {

}
