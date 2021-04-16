package exercises.technology.main;

public class Laptop extends Computer {

    // Class variable(s)
    private Integer charge;
    private Boolean isPluggedIn;

    // Constructor(s)
    public Laptop(String model, String operatingSystem, Double gigStorage) {
        super (model, operatingSystem, gigStorage);
        this.charge = 100;
        this.isPluggedIn = true;
    }

    public Laptop(String model, String operatingSystem, Double gigStorage, Integer charge, Boolean isPluggedIn) {
        super (model, operatingSystem, gigStorage);
        this.charge = charge;
        this.isPluggedIn = isPluggedIn;
    }

    // Method(s)

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Boolean getPluggedIn() {
        return isPluggedIn;
    }

    public void setPluggedIn(Boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }

    public String hasPower() {
        if (this.isPluggedIn) {
            return "The laptop is plugged in.";
        } else {
            return "The laptop has " + this.charge + "% battery left.";
        }
    }
}
