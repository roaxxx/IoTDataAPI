package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.dto.IoTInfoDTO;
import co.edu.jdc.IoTDataAPI.model.entity.Alarm;
import co.edu.jdc.IoTDataAPI.model.entity.DHT11Data;
import co.edu.jdc.IoTDataAPI.model.entity.Door;
import co.edu.jdc.IoTDataAPI.service.AlarmService;
import co.edu.jdc.IoTDataAPI.service.DHT11DataService;
import co.edu.jdc.IoTDataAPI.service.DoorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("IoTInfo")
@AllArgsConstructor
public class IoTInfoController {

    private final AlarmService alarmService;
    private final DoorService doorService;
    private final DHT11DataService dht11DataService;

    @GetMapping()
    public ResponseEntity<IoTInfoDTO> getIoTInfo(){

        IoTInfoDTO ioTInfoDTO = new IoTInfoDTO();

        List<Alarm> alarmList = alarmService.listAllAlarms();
        List<Door> doorList = doorService.listAllDoors();
        DHT11Data dht11DataLastRecord = dht11DataService.findLatestData();

        ioTInfoDTO.setAlarms(alarmList);
        ioTInfoDTO.setDoors(doorList);
        ioTInfoDTO.setLastRecord(dht11DataLastRecord);

        return new ResponseEntity<>(ioTInfoDTO, HttpStatus.OK);
    }

}
