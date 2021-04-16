package exercises.technology.tests;

import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LaptopTest {

    // Make a LaptopTest class variable
    Laptop test_laptop;

    @Before
    public void createLaptopObject() {
        test_laptop = new Laptop("iMac2021", "Yosemite",
                256.0, 88, false);
    }

    // TODO: Test the constructor
    @Test
    public void constructorSetsValuesTest() {
        assertEquals("iMac2021", test_laptop.getModel());
        assertEquals("Yosemite", test_laptop.getOperatingSystem());
        assertEquals(256.0, test_laptop.getGigStorage(), .01);
        assertEquals(88, test_laptop.getCharge(), .01);
        assertEquals(false, test_laptop.getPluggedIn());
    }

    // TODO: Test if hasPower knows if laptop is plugged in
    @Test
    public void hasPowerHasMessageForPluggedInLaptopTest() {
        test_laptop.setPluggedIn(true);
        assertEquals("The laptop is plugged in.", test_laptop.hasPower());
    }

    // TODO: Test if hasPower shows battery level if it is not plugged in
    @Test
    public void hasPowerShowsBatteryLevelIfNotPluggedInTest() {
        assertEquals("The laptop has 88% battery left.", test_laptop.hasPower());
    }
}
