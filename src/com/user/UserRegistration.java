
import java.util.regex.Pattern;

import exception.UserValidationException;

public class UserRegistration {

    // Regex constants
    private static final String FIRST_NAME_REGEX =
            "^[A-Z][a-z]{2,}$";

    private static final String LAST_NAME_REGEX =
            "^[A-Z][a-z]{2,}$";

    private static final String EMAIL_REGEX =
             "^[a-zA-Z](?!.*\\.\\.)([a-zA-Z0-9+_-]|(\\.(?=[a-zA-Z0-9+_-])))*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";

    private static final String MOBILE_REGEX =
            "^[0-9]{2} [0-9]{10}$";

    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*\\d)(?=(?:.*[@#$%^&+=!]){1}).{8,}$";


    // Validation methods
    public static void validateFirstName(String name) throws UserValidationException {
        if(!Pattern.matches(FIRST_NAME_REGEX, name)){
            throw new UserValidationException("Invalid First Name");
        }
    }

    public static void validateLastName(String name) throws UserValidationException{
        if(!Pattern.matches(LAST_NAME_REGEX, name)){
            throw new UserValidationException("Invalid Last Name");
        }
    }

    public static void validateEmail(String email) throws UserValidationException{
        if(!Pattern.matches(EMAIL_REGEX, email)){
            throw new UserValidationException("Invalid Email");
        }
    }

    public static void validateMobile(String mobile) throws UserValidationException{
        if(!Pattern.matches(MOBILE_REGEX, mobile)){
            throw new UserValidationException("Invalid Mobile Number");
        }
    }

    public static void validatePassword(String password) throws UserValidationException{
        if(!Pattern.matches(PASSWORD_REGEX, password)){
            throw new UserValidationException("Invalid Password");
        }
    }
}
