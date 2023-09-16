package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.DHT11Data;
import co.edu.jdc.IoTDataAPI.repository.DHT11DataRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DHT11DataService {


    private final DHT11DataRepository dht11DataRepository;

    @Autowired
    public DHT11DataService(DHT11DataRepository dht11DataRepository) {
        this.dht11DataRepository = dht11DataRepository;
    }

    /**
     * Method to list all the DHT11 sensor records
     * @return DTH11Data List or null if no data found
     */
    public List<DHT11Data> listDHT11Data(){
        return dht11DataRepository.findAll();
    }

    /**
     * Method to save DHT11 sensor record
     * @param dht11Data object to save
     * @return true if saved or false if not
     */
    public DHT11Data saveDHT11Data(DHT11Data dht11Data){
        dht11Data.setDate(DateTime.getCurrentFormattedDateTime());
        dht11Data.setTime(DateTime.getCurrentFormattedTime());
        return dht11DataRepository.save(dht11Data);
    }

    /**
     * Method to find latest DHT11 sensor record
     * @return DHT11Data object
     */
    public DHT11Data findLatestData(){
        List<DHT11Data> latestDataList = dht11DataRepository.findLatestData();
        return latestDataList.isEmpty() ? null : latestDataList.get(0);
    }

    /**
     * Method to drop all DHT11 sensor records
     */
    public Boolean dropDHTDataRecords(){
        dht11DataRepository.deleteAll();
        return dht11DataRepository.findAll().isEmpty();
    }
}
