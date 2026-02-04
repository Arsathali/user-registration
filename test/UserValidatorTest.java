
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import exception.UserValidationException;

class UserValidatorTest {

    // First Name
    @Test
    void givenValidFirstName_shoulNotThrowException() {
        assertDoesNotThrow(()->UserRegistration.validateFirstName("Arsha"));
    }

    @Test
    void givenInvalidFirstName_shouldThrowException() {
        assertThrows(UserValidationException.class,() -> UserRegistration.validateFirstName("ar"));
    }

    // Last Name
    @Test
    void givenValidLastName_shouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserRegistration.validateLastName("Kumar"));
    }

    @Test
    void givenInvalidLastName_shouldThrowException() {
        assertThrows(UserValidationException.class, () ->
            UserRegistration.validateLastName("ku"));
    }

    // Mobile
    @Test
    void givenValidMobile_shouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserRegistration.validateMobile("91 9919819801"));
    }

    @Test
    void givenInvalidMobile_shouldThrowException() {
        assertThrows(UserValidationException.class, () ->
            UserRegistration.validateMobile("919919819801"));
    }

    // Password
    @Test
    void givenValidPassword_shouldNotThrowException() {
        assertDoesNotThrow(() ->
            UserRegistration.validatePassword("Abcdef@1"));
    }

    @Test
    void givenInvalidPassword_shouldThrowException() {
        assertThrows(UserValidationException.class, () ->
            UserRegistration.validatePassword("abcdefg"));
    }

}
