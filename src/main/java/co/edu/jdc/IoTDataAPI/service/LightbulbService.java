package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.Lightbulb;
import co.edu.jdc.IoTDataAPI.repository.LightbulbRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightbulbService {

    @Autowired
    private LightbulbRepositoy lightbulbRepositoy;

    public boolean updateLightbulb(Lightbulb lightbulb){
        if(lightbulbRepositoy.save(lightbulb)!=null){
            return true;
        }else{
            return false;
        }
    }

    public List<Lightbulb> listAllLighbulbs(){
        return lightbulbRepositoy.findAll();
    }
}
