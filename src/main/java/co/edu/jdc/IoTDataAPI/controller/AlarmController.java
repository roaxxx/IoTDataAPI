package co.edu.jdc.IoTDataAPI.controller;
/*Autor: William Roa*/
import co.edu.jdc.IoTDataAPI.model.Alarm;
import co.edu.jdc.IoTDataAPI.service.AlarmService;
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
