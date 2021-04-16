package exercises.technology.main;

public class Program {
    public static void main(String[] args) {

        // SmartPhone tests
        SmartPhone android = new SmartPhone("Android",
                "Windows", 10.0, false, false);

        System.out.println(android.securityRating());
        android.setPasswordProtected(true);
        System.out.println(android.securityRating());
        android.setBiometricsProtected(true);
        System.out.println(android.securityRating());
        System.out.println(android.turnOff());
        System.out.println(android.turnOn());
        System.out.println(android.turnOn());
        System.out.println(android.getId());
        System.out.println("*********");

        // Laptop tests
        Laptop mac = new Laptop("Macbook Air", "Big Sur", 256.0, 100, false);

        System.out.println(mac.hasPower());
        mac.setPluggedIn(true);
        System.out.println(mac.hasPower());
        mac.turnOff();
        mac.turnOn();
        mac.turnOn();
        System.out.println(mac.getId());
        System.out.println("*********");

        // Computer tests
        Computer myComputer = new Computer("iMac", "Catalina", 300.0);

        System.out.println(myComputer.turnOn());
        System.out.println(myComputer.turnOff());
        System.out.println(myComputer.turnOff());
        System.out.println(myComputer.getId());




    }
}