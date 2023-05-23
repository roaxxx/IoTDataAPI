package co.edu.jdc.IoTDataAPI.controllers;

import co.edu.jdc.IoTDataAPI.models.Door;
import co.edu.jdc.IoTDataAPI.services.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dhtSensor")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @GetMapping("/listDoors")
    public List<Door> listDoors(){
        return doorService.listAllDoors();
    }

    @PostMapping("/updateDoors")
    public boolean updateDoors(@RequestBody Door door){
        return doorService.updateDoor(door);
    }
}
