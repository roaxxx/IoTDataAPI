package co.edu.jdc.IoTDataAPI.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "DHT11_DATA")
public class DHT11Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int measurementId;
    private Integer temperature;
    private Integer humidity;
    private String date;
    private String time;

    public int getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(int measurementId) {
        this.measurementId = measurementId;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
