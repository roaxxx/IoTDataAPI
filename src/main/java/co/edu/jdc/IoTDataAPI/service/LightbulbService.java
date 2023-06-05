package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.Lightbulb;
import co.edu.jdc.IoTDataAPI.repository.LightbulbRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightbulbService {

    private final LightbulbRepositoy lightbulbRepositoy;

    @Autowired
    public LightbulbService(LightbulbRepositoy lightbulbRepositoy) {
        this.lightbulbRepositoy = lightbulbRepositoy;
    }

    /**
     * Update a lightbuld record on database
     * @param lightbulb object to update record
     * @return true if updated or false if not
     */
    public boolean updateLightbulb(Lightbulb lightbulb){
        if(lightbulbRepositoy.save(lightbulb)!=null){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Find all lightbulbs records on database
     * @return Lightbulb list or null if not data found
     */
    public List<Lightbulb> listAllLighbulbs(){
        return lightbulbRepositoy.findAll();
    }
}
