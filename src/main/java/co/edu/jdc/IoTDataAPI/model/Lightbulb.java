package co.edu.jdc.IoTDataAPI.model;

import javax.persistence.*;

@Entity
@Table(name = "lightbulbs")
public class Lightbulb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Lightbulbs")
    private int idLightbulbs;

    @Column(name = "Ubication")
    private String ubication;

    @Column(name = "Bulb_Controler_Type")
    private String bulbControlerType;

    @Column(name = "Bulb_value")
    private String bulbValue;

    public int getIdLightbulbs() {
        return idLightbulbs;
    }

    public void setIdLightbulbs(int idLightbulbs) {
        this.idLightbulbs = idLightbulbs;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public String getBulbControlerType() {
        return bulbControlerType;
    }

    public void setBulbControlerType(String bulbControlerType) {
        this.bulbControlerType = bulbControlerType;
    }

    public String getBulbValue() {
        return bulbValue;
    }

    public void setBulbValue(String bulbValue) {
        this.bulbValue = bulbValue;
    }
}

