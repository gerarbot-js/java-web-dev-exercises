package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class ComputerTest {

    // Make a computer class variable
    Computer test_computer;

    @Before
    public void createComputerObject() { test_computer = new Computer("iMac2021", "Yosemite",
            256.0); }

    // TODO: Add emptyTest to configure runtime environment
    @Test
    public void emptyTest() { assertEquals(10, 10, .01); }

    // TODO: Test the constructor
    @Test
    public void constructorSetsValuesTest() {
        assertEquals("iMac2021", test_computer.getModel());
        assertEquals("Yosemite", test_computer.getOperatingSystem());
        assertEquals(256.0, test_computer.getGigStorage(), .01);

    }

    // TODO: Test that isOn defaults to true
    @Test
    public void isOnDefaultsToTrueTest() { assertTrue(test_computer.getOn()); }

    // TODO: Test that turnOn method returns specific message if isOn is true
    @Test
    public void turnOnReturnsAlreadyOnMessageIfIsOnTrueTest() {
        assertEquals("The iMac2021 is already on.", test_computer.turnOn());
    }

    // TODO: Test that turnOn method returns specific message if isOn is false
    @Test
    public void turnOnReturnsGreetingIfIsOnFalseTest() {
        test_computer.setOn(false);
        assertEquals("Turning on. Hello!", test_computer.turnOn());
    }

    // TODO: Test that turnOff method returns specific message if isOn is false
    @Test
    public void turnOffReturnsAlreadyOffMessageIfIsOnFalseTest() {
        test_computer.setOn(false);
        assertEquals("The iMac2021 is already off.", test_computer.turnOff());
    }

    // TODO: Test that turnOff method returns specific message if isOff is true
    @Test
    public void turnOffReturnsGoodbyeMessageIfIsOnTrueTest() {
        assertEquals("Shutting down. Goodbye!", test_computer.turnOff());
    }




}
