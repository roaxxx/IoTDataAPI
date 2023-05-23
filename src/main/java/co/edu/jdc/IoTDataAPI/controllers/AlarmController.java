package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.Alarm;
import co.edu.jdc.IoTDataAPI.services.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alarm")
public class AlarmController {

    @Autowired
    private AlarmService alarmService;

    @GetMapping("/findAlarms")
    public List<Alarm> getAllAlarms(){
        return alarmService.listAllAlarms();
    }

    @PostMapping("/UpdateAlarm")
    public Boolean updateAlarm(@RequestBody Alarm alarm){
        return alarmService.updateAlarm(alarm);
    }
}
