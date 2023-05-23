package co.edu.jdc.IoTDataAPI.models;

import javax.persistence.*;

@Entity
@Table(name = "Door")
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDoor;
    private String doorName;
    private String doorState;
    private String updateDate;

    public int getIdDoor() {
        return idDoor;
    }

    public void setIdDoor(int idDoor) {
        this.idDoor = idDoor;
    }

    public String getDoorName() {
        return doorName;
    }

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
