package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.Door;
import co.edu.jdc.IoTDataAPI.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*Autor: William Roa*/
@RestController
@RequestMapping("door")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @GetMapping("/listDoors")
    public List<Door> listDoors(){
        return doorService.listAllDoors();
    }

    @PostMapping("/updateDoor")
    public boolean updateDoors(@RequestBody Door door){
        return doorService.updateDoor(door);
    }
}
