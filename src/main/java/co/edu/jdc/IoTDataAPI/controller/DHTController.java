package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.entity.DHT11Data;
import co.edu.jdc.IoTDataAPI.service.DHT11DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dhtSensor")
public class DHTController {

    @Autowired
    private DHT11DataService dht11DataService;

    @GetMapping
    public ResponseEntity<List<DHT11Data>> listDHT11Data(){
        List<DHT11Data> dht11RecordData = dht11DataService.listDHT11Data();
        return  ResponseEntity.ok(dht11RecordData);
    }

    @PostMapping
    public ResponseEntity<DHT11Data> saveDHT11Data(@RequestBody DHT11Data dht11Data){
        DHT11Data savedDHT11DataDHT11Data = dht11DataService.saveDHT11Data(dht11Data);
        return new ResponseEntity<>(savedDHT11DataDHT11Data, HttpStatus.CREATED);
    }

    @GetMapping("/getLatest")
    public ResponseEntity<DHT11Data> findLatestDataFromDHT11(){
        DHT11Data latestData = dht11DataService.findLatestData();
        if(latestData != null){
            return new ResponseEntity<>(latestData ,HttpStatus.OK );
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND );
        }
    }

    @DeleteMapping()
    public ResponseEntity<Void> deleteAllRecords(){
        boolean isRecordsDeleted = dht11DataService.dropDHTDataRecords();
        if( isRecordsDeleted){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
    }
}
