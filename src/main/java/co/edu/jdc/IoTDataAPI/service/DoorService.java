package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.Door;
import co.edu.jdc.IoTDataAPI.repository.DoorRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoorService {
    @Autowired
    private DoorRepository doorRepository;


    public  boolean updateDoor(Door door){
        door.setUpdateDate(DateTime.getCurrentFormattedDateTime());
        if(doorRepository.save(door)!=null){
            return true;
        }else{
            return false;
        }
    }

    public List<Door> listAllDoors(){
        return doorRepository.findAll();
    }
}
