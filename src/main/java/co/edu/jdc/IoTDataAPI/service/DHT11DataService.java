package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.DHT11Data;
import co.edu.jdc.IoTDataAPI.repository.DHT11DataRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DHT11DataService {

    @Autowired
    private DHT11DataRepository dht11DataRepository;

    public List<DHT11Data> listDHT11Data(){
        return dht11DataRepository.findAll();
    }

    public boolean saveDHT11Data(DHT11Data dht11Data){
        dht11Data.setDate(DateTime.getCurrentFormattedDateTime());
        dht11Data.setTime(DateTime.getCurrentFormattedTime());

        if(dht11DataRepository.save(dht11Data)!=null){
            return true;
        }else{
            return false;
        }
    }

    public DHT11Data findLatestData(){
        List<DHT11Data> latestDataList = dht11DataRepository.findLatestData();
        return latestDataList.isEmpty() ? null : latestDataList.get(0);
    }
    public void dropDHTDataRecords(){
        dht11DataRepository.deleteAll();
    }
}
