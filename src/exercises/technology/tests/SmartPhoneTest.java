package exercises.technology.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {

    // Add a class variable of object type SmartPhone
    SmartPhone test_smartphone;

    @Before
    public void createSmartPhoneObject() {
        test_smartphone = new SmartPhone(   "Android", "Windows",
                80.0, false, false);
    }

    // TODO: Test the constructor
    @Test
    public void constructorSetsValuesTest() {
        assertEquals("Android", test_smartphone.getModel());
        assertEquals("Windows", test_smartphone.getOperatingSystem());
        assertEquals(80.0, test_smartphone.getGigStorage(), .01);
        assertEquals(false, test_smartphone.getPasswordProtected());
        assertEquals(false, test_smartphone.getBiometricsProtected());
    }

    // TODO: securityRating returns "no security" if isPasswordProtected and isBiometricsProtected are false
    @Test
    public void securityRatingReturnsNoSecurityMessageIfNotProtectedTest() {
        assertEquals("This Android has no security.", test_smartphone.securityRating());
    }

    // TODO: securityRating returns "average security" if Smart Phone only has one security feature set to true
    @Test
    public void securityRatingReturnsAverageSecurityIfOnlyOneSecurityFeatureSetToTrueTest() {
        test_smartphone.setPasswordProtected(true);
        assertEquals("This Android has average security.", test_smartphone.securityRating());
        test_smartphone.setPasswordProtected(false);
        test_smartphone.setBiometricsProtected(true);
        assertEquals("This Android has average security.", test_smartphone.securityRating());
    }

    // TODO: securityRating returns "strong security" if Smart Phone has both security features set to true
    @Test
    public void securityRatingReturnsStrongSecurityIfBothSecurityFeaturesSetToTrueTest() {
        test_smartphone.setPasswordProtected(true);
        test_smartphone.setBiometricsProtected(true);
        assertEquals("This Android has strong security.", test_smartphone.securityRating());
    }
}

