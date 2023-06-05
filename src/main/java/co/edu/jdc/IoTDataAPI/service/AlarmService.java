package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.Alarm;
import co.edu.jdc.IoTDataAPI.repository.AlarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmService {

    @Autowired
    private AlarmRepository alarmRepository;

    /**
     * Method to update one alarm
     * @param alarm -> alarm object
     * @return true if update is done
     */
    public boolean updateAlarm(Alarm alarm){
        alarmRepository.save(alarm);
        return true;
    }

    /**
     * Method to find all alarms
     * @return list of alarm objects
     */
    public List<Alarm> listAllAlarms(){
        return alarmRepository.findAll();
    }
}
