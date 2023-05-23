package co.edu.jdc.IoTDataAPI.services;

import co.edu.jdc.IoTDataAPI.models.Lightbulb;
import co.edu.jdc.IoTDataAPI.repositories.LightbulbRepositoy;
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
