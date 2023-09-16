package co.edu.jdc.IoTDataAPI.model.dto;

import co.edu.jdc.IoTDataAPI.model.entity.Alarm;
import co.edu.jdc.IoTDataAPI.model.entity.DHT11Data;
import co.edu.jdc.IoTDataAPI.model.entity.Door;
import lombok.Data;

import java.util.List;

@Data
public class IoTInfoDTO {

    private DHT11Data lastRecord;
    private List<Alarm> alarms;
    private List<Door> doors;

}
