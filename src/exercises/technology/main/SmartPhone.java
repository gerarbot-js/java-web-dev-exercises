package exercises.technology.main;

public class SmartPhone extends Computer {

    // Class variable(s)
    private Boolean isPasswordProtected;
    private Boolean isBiometricsProtected;

    // Constructor(s)
    public SmartPhone(String model, String operatingSystem, Double gigStorage, Boolean isPasswordProtected,
                      Boolean isBiometricsProtected) {
        super (model, operatingSystem, gigStorage);
        this.isPasswordProtected = isPasswordProtected;
        this.isBiometricsProtected = isBiometricsProtected;
    }

    // Method(s)

    public Boolean getPasswordProtected() {
        return isPasswordProtected;
    }

    public void setPasswordProtected(Boolean passwordProtected) {
        isPasswordProtected = passwordProtected;
    }

    public Boolean getBiometricsProtected() {
        return isBiometricsProtected;
    }

    public void setBiometricsProtected(Boolean biometricsProtected) {
        isBiometricsProtected = biometricsProtected;
    }

    public String securityRating() {
        if (this.isPasswordProtected && this.isBiometricsProtected) {
            return "This " + this.getModel() + " has strong security.";
        } else if (this.isPasswordProtected || this.isBiometricsProtected) {
            return "This " + this.getModel() + " has average security.";
        } else {
            return "This " + this.getModel() + " has no security.";
        }
    }
}
