package co.edu.jdc.IoTDataAPI.repositories;

import co.edu.jdc.IoTDataAPI.models.DHT11Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DHT11DataRepository extends JpaRepository<DHT11Data, Integer> {
}
