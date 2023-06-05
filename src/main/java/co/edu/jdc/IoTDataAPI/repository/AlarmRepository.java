package co.edu.jdc.IoTDataAPI.repository;

import co.edu.jdc.IoTDataAPI.model.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepository extends JpaRepository<Alarm, String> {

}
