package co.edu.jdc.IoTDataAPI.services;

import co.edu.jdc.IoTDataAPI.models.Alarm;
import co.edu.jdc.IoTDataAPI.repositories.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmService {

    @Autowired
    private AlarmRepository alarmRepository;

    public boolean updateAlarm(Alarm alarm){
        alarmRepository.save(alarm);
        return true;
    }
    public List<Alarm> listAllAlarms(){
        return alarmRepository.findAll();
    }
}
