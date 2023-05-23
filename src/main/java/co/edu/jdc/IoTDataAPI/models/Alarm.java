package co.edu.jdc.IoTDataAPI.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alarm")
public class Alarm {

    @Id
    private String idAlarm;

    @Column(name = "Alarm_name")
    private String alarmName;

    @Column(name = "Alarm_State")
    private String alarmState;

    public String getIdAlarm() {
        return idAlarm;
    }

    public void setIdAlarm(String idAlarm) {
        this.idAlarm = idAlarm;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(String alarmState) {
        this.alarmState = alarmState;
    }
}
