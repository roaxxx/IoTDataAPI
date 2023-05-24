package co.edu.jdc.IoTDataAPI.services;

import co.edu.jdc.IoTDataAPI.models.DHT11Data;
import co.edu.jdc.IoTDataAPI.repositories.DHT11DataRepository;
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
        System.out.println("Data "+dht11Data.getDate()+" time"+dht11Data.getTime());
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
}
