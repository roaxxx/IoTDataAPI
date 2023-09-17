package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.entity.Lightbulb;
import co.edu.jdc.IoTDataAPI.service.LightbulbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("lightbulb")
public class LightbulbController {

    @Autowired
    private LightbulbService lightbulbService;

    @PatchMapping("{idLightbulb}")
    public ResponseEntity<Lightbulb> updateLightbulb(
            @PathVariable int idLightbulb,
            @RequestBody String lightbulbState
    ){
        try{
            Lightbulb updateLightbulb = lightbulbService.updateLightbulb(idLightbulb, lightbulbState);
            return new ResponseEntity<>(updateLightbulb, HttpStatus.OK);
        } catch (EntityNotFoundException ex){
            return new ResponseEntity<>( HttpStatus.NOT_FOUND );
        } catch (Exception e){
            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR );
        }
    }

    @GetMapping()
    public ResponseEntity<List<Lightbulb>> getAllLightbulbs(){
        return new ResponseEntity<>(lightbulbService.listAllLighbulbs(), HttpStatus.OK) ;
    }
}
