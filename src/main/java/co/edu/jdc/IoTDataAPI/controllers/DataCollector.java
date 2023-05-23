package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.Alarm;
import co.edu.jdc.IoTDataAPI.models.DHT11Data;
import co.edu.jdc.IoTDataAPI.models.Door;
import co.edu.jdc.IoTDataAPI.services.AlarmService;
import co.edu.jdc.IoTDataAPI.services.DHT11DataService;
import co.edu.jdc.IoTDataAPI.services.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CollectData")
public class DataCollector {

    @Autowired
    private AlarmService alarmService;
    @Autowired
    private DoorService doorService;
    @Autowired
    private DHT11DataService dht11DataService;

    @GetMapping("/findAlarms")
    public List<Alarm> getAllAlarms(){
        return alarmService.listAllAlarms();
    }

    @PostMapping("/UpdateAlarm")
    public Boolean updateAlarm(@RequestBody Alarm alarm){
        return alarmService.updateAlarm(alarm);
    }

    @GetMapping("/listDoors")
    public List<Door> listDoors(){
        return doorService.listAllDoors();
    }

    @PostMapping("/updateDoors")
    public boolean updateDoors(@RequestBody Door door){
        return doorService.updateDoor(door);
    }

    @GetMapping("/listDHT11Data")
    public List<DHT11Data> listDHT11Data(){
        return dht11DataService.listDHT11Data();
    }

    @PostMapping("/saveDHT11Data")
    public boolean saveDHT11Data(@RequestBody DHT11Data dht11Data){
        return dht11DataService.saveDHT11Data(dht11Data);
    }

}
