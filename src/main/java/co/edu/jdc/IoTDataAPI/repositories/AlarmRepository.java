package co.edu.jdc.IoTDataAPI.repositories;

import co.edu.jdc.IoTDataAPI.models.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlarmRepository extends JpaRepository<Alarm, String> {

}
