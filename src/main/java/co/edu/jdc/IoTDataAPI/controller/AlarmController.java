package co.edu.jdc.IoTDataAPI.controller;
/*Autor: William Roa*/
import co.edu.jdc.IoTDataAPI.model.dto.AlarmConditionsDTO;
import co.edu.jdc.IoTDataAPI.model.entity.Alarm;
import co.edu.jdc.IoTDataAPI.service.AlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/alarms")
public class AlarmController {

    @Autowired
    private AlarmService alarmService;

    @PatchMapping("/{alarmId}")
    public ResponseEntity<Alarm> updateAlarmState(
            @PathVariable String alarmId,
            @RequestBody AlarmConditionsDTO alarmConditionsDTO
    ){
        try{
            Alarm alarmToUpdate = alarmService.findAlarmById(alarmId);
            if( alarmToUpdate != null) {
                alarmToUpdate.setAlarmState(alarmConditionsDTO.getAlarmState());
                alarmToUpdate.setCondition(alarmConditionsDTO.getCondition());
            }
            Alarm updatedAlarm = alarmService.saveAlarm(alarmToUpdate);
            return ResponseEntity.ok(updatedAlarm);
        }catch (EntityNotFoundException e){
            return  ResponseEntity.notFound().build();
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }

    }
}
