package exercises.technology.main;

import java.sql.SQLOutput;

public class Computer extends AbstractEntity {

    // Class variable(s)
    private String model;
    private String operatingSystem;
    private Double gigStorage;
    private Boolean isOn = true;

    // Constructor(s)
    public Computer (String model, String operatingSystem, Double gigStorage) {
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.gigStorage = gigStorage;
    }

    // Method(s)
    public String getModel() {
        return this.model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Double getGigStorage() {
        return this.gigStorage;
    }

    public void setGigStorage(Double gigStorage) {
        this.gigStorage = gigStorage;
    }

    public Boolean getOn() {
        return this.isOn;
    }

    public void setOn(Boolean on) {
        this.isOn = on;
    }

    public String turnOn() {
        if (!this.isOn) {
            this.isOn = true;
            return "Turning on. Hello!";
        } else {
            return "The " + this.model + " is already on.";
        }
    }

    public String turnOff() {
        if (this.isOn) {
            this.isOn = false;
            return "Shutting down. Goodbye!";
        } else {
            return "The " + this.model + " is already off.";
        }
    }
}
