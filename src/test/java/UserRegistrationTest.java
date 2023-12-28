import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {

    @Test
    public void testValidFirstName() {
        assertTrue(UserRegistration.validateFirstName("Yogin"));
        assertTrue(UserRegistration.validateFirstName("Krish"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(UserRegistration.validateFirstName("jatt"));  // Should start with a capital letter
        assertFalse(UserRegistration.validateFirstName("J"));     // Should have at least 3 characters
    }

    @Test
    public void testValidLastName() {
        assertTrue(UserRegistration.validateLastName("Jatt"));
        assertTrue(UserRegistration.validateLastName("Siri"));
    }

    @Test
    public void testInvalidLastName() {
        assertFalse(UserRegistration.validateLastName("jatt"));     // Should start with a capital letter
        assertFalse(UserRegistration.validateLastName("J"));       // Should have at least 3 characters
    }

    @Test
    public void testValidEmail() {
        assertTrue(UserRegistration.validateEmail("jatt.kant@example.com"));
        assertTrue(UserRegistration.validateEmail("sher_jatt123@test.co"));
    }

    @Test
    public void testInvalidEmail() {
        assertFalse(UserRegistration.validateEmail("invalid-email"));
        assertFalse(UserRegistration.validateEmail("jatt.kant@com"));
    }

    @Test
    public void testValidMobileNumber() {
        assertTrue(UserRegistration.validateMobileNumber("91 9876543210"));
        assertTrue(UserRegistration.validateMobileNumber("44 7123456789"));
    }

    @Test
    public void testInvalidMobileNumber() {
        assertFalse(UserRegistration.validateMobileNumber("9876543210"));  // Missing country code and space
        assertFalse(UserRegistration.validateMobileNumber("91 123456"));    // Not enough digits
    }

    @Test
    public void testValidPassword() {
        assertTrue(UserRegistration.validatePassword("Passw0rd!"));
        assertTrue(UserRegistration.validatePassword("StrongP@ss123"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(UserRegistration.validatePassword("weakpass"));       // Missing uppercase and special character
        assertFalse(UserRegistration.validatePassword("Short1!"));        // Less than 8 characters
    }
}
