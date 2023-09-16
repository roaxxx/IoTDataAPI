package co.edu.jdc.IoTDataAPI.repository;

import co.edu.jdc.IoTDataAPI.model.entity.DHT11Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DHT11DataRepository extends JpaRepository<DHT11Data, Integer> {

    @Query("SELECT d FROM DHT11Data d ORDER BY d.measurementId DESC")
    List<DHT11Data> findLatestData();
}
