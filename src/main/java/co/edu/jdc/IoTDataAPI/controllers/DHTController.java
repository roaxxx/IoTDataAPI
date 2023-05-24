package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.DHT11Data;
import co.edu.jdc.IoTDataAPI.services.DHT11DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dhtSensor")
public class DHTController {

    @Autowired
    private DHT11DataService dht11DataService;

    @GetMapping("/listDHT11Data")
    public List<DHT11Data> listDHT11Data(){
        return dht11DataService.listDHT11Data();
    }

    @PostMapping("/saveDHT11Data")
    public boolean saveDHT11Data(@RequestBody DHT11Data dht11Data){
        return dht11DataService.saveDHT11Data(dht11Data);
    }

    @GetMapping("getLatest")
    public DHT11Data findLatestDataFromDHT11(){
        return dht11DataService.findLatestData();
    }
}
