package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.Door;
import co.edu.jdc.IoTDataAPI.repository.DoorRepository;
import co.edu.jdc.IoTDataAPI.util.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoorService {
    @Autowired
    private DoorRepository doorRepository;

    /**
     * update door state with given state
     *
     * @param idDoor id door to update
     * @param doorState new door state to set
     * @return door updated, with new state
     */
    public  Door updateDoor(int idDoor, String doorState){
        Door doorToUpdate = doorRepository.getById(idDoor);
        doorToUpdate.setDoorState(doorState);
        doorToUpdate.setUpdateDate(DateTime.getCurrentFormattedDateTime());
        return doorRepository.save(doorToUpdate);
    }

    /**
     * List all doors records
     * @return List of Door objects or null, if not
     */
    public List<Door> listAllDoors(){
        return doorRepository.findAll();
    }
}
