package co.edu.jdc.IoTDataAPI.service;

import co.edu.jdc.IoTDataAPI.model.entity.Lightbulb;
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
     * @param idLightbulb id o lightbulb to update
     * @param lightbulbState new state to set
     * @return Lightbulb to update
     */
    public Lightbulb updateLightbulb(int idLightbulb, String lightbulbState){
        Lightbulb lightbulbToUpdate = lightbulbRepositoy.getById(idLightbulb);
        lightbulbToUpdate.setBulbValue(lightbulbState);
        return lightbulbRepositoy.save(lightbulbToUpdate);
    }

    /**
     * Find all lightbulbs records on database
     * @return Lightbulb list or null if not data found
     */
    public List<Lightbulb> listAllLighbulbs() {
        return lightbulbRepositoy.findAll();
    }
}
