package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.entity.Door;
import co.edu.jdc.IoTDataAPI.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
/*Autor: William Roa*/
@RestController
@RequestMapping("door")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @PatchMapping("{idDoor}")
    public ResponseEntity<Door> updateDoors(
            @PathVariable int idDoor,
            @RequestBody String doorState)
    {
        try{
            Door updatedDoor = doorService.updateDoor(idDoor,doorState);
            return new ResponseEntity<>(updatedDoor, HttpStatus.OK);
        }catch( EntityNotFoundException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }catch (Exception exception){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
