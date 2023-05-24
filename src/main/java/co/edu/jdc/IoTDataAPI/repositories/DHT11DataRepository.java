package co.edu.jdc.IoTDataAPI.repositories;

import co.edu.jdc.IoTDataAPI.models.DHT11Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DHT11DataRepository extends JpaRepository<DHT11Data, Integer> {

    @Query("SELECT d FROM DHT11Data d ORDER BY d.measurementId DESC")
    List<DHT11Data> findLatestData();
}
