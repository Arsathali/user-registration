
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserValidatorTest {

    // First Name
    @Test
    void givenValidFirstName_whenValidated_thenReturnsTrue() {
        assertTrue(UserRegistration.validateFirstName("Arsha"));
    }

    @Test
    void givenInvalidFirstName_whenValidated_thenReturnsFalse() {
        assertFalse(UserRegistration.validateFirstName("ar"));
    }

    // Last Name
    @Test
    void givenValidLastName_whenValidated_thenReturnsTrue() {
        assertTrue(UserRegistration.validateLastName("Kumar"));
    }

    @Test
    void givenInvalidLastName_whenValidated_thenReturnsFalse() {
        assertFalse(UserRegistration.validateLastName("ku"));
    }

    // Email
    @Test
    void givenValidEmail_whenValidated_thenReturnsTrue() {
        assertTrue(UserRegistration.validateEmail("abc-100@abc.net"));
    }

    @Test
    void givenInvalidEmail_whenValidated_thenReturnsFalse() {
        assertFalse(UserRegistration.validateEmail("abc@.com"));
    }

    // Mobile
    @Test
    void givenValidMobileNumber_whenValidated_thenReturnsTrue() {
        assertTrue(UserRegistration.validateMobile("91 9919819801"));
    }

    @Test
    void givenInvalidMobileNumber_whenValidated_thenReturnsFalse() {
        assertFalse(UserRegistration.validateMobile("919919819801"));
    }

    // Password
    @Test
    void givenValidPassword_whenValidated_thenReturnsTrue() {
        assertTrue(UserRegistration.validatePassword("Abcdef@1"));
    }

    @Test
    void givenInvalidPassword_whenValidated_thenReturnsFalse() {
        assertFalse(UserRegistration.validatePassword("abcdefg"));
    }
}
