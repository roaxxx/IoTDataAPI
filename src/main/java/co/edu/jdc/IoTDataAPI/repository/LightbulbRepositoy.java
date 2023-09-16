package co.edu.jdc.IoTDataAPI.repository;

import co.edu.jdc.IoTDataAPI.model.entity.Lightbulb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightbulbRepositoy  extends JpaRepository<Lightbulb,Integer> {

}
