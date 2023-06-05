package co.edu.jdc.IoTDataAPI.controller;

import co.edu.jdc.IoTDataAPI.model.Lightbulb;
import co.edu.jdc.IoTDataAPI.service.LightbulbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lightbulb")
public class LightbulbController {
    @Autowired
    private LightbulbService lightbulbService;

    @PostMapping("update")
    public boolean updateLightbulb(@RequestBody Lightbulb lightbulb){
        return lightbulbService.updateLightbulb(lightbulb);
    }

    @GetMapping("list")
    public List<Lightbulb> listLightbulbList(){
        return lightbulbService.listAllLighbulbs();
    }
}
