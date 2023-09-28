package co.edu.jdc.IoTDataAPI.model.dto;

public class AlarmConditionsDTO {
    private String alarmState;
    private int condition;

    public String getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(String alarmState) {
        this.alarmState = alarmState;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }
}
