
import java.util.regex.Pattern;

public class UserRegistration {

    static boolean validate(String input , String regex){
        return Pattern.matches(regex,input);
    }

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
    public static boolean validateFirstName(String name) {
        return Pattern.matches(FIRST_NAME_REGEX, name);
    }

    public static boolean validateLastName(String name) {
        return Pattern.matches(LAST_NAME_REGEX, name);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static boolean validateMobile(String mobile) {
        return Pattern.matches(MOBILE_REGEX, mobile);
    }

    public static boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }
}
