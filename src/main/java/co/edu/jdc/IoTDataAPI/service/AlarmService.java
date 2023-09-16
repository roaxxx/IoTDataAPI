package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.Alarm;
import co.edu.jdc.IoTDataAPI.repository.AlarmRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AlarmService {

    @Autowired
    private AlarmRepository alarmRepository;

    /**
     * Method to update one alarm
     * @param alarmId -> id of and alarm
     * @return true if update is done
     */
    public Alarm saveAlarm(Alarm alarm){
        return alarmRepository.save(alarm);
    }

    /**
     * Method to find all alarms
     * @return list of alarm objects
     */
    public List<Alarm> listAllAlarms(){
        return alarmRepository.findAll();
    }


    public Alarm findAlarmById(String alarmId){
        return alarmRepository.findById(alarmId)
                    .orElseThrow(
                            () -> new EntityNotFoundException("Registro no encontrado por id: "+alarmId)
                    );
    }
}
