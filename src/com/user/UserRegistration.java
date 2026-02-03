import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static boolean validate(String input , String regex){
        return Pattern.matches(regex,input);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //first name
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        String firstNameRegex = "^[A-Z][a-z]{2,}$";
        
        System.out.println(
            validate(firstName,firstNameRegex)
                ?"Valid First Name"
                :"Invalid First name"
        );

        //last name
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        String lastNameRegex = "^[A-Z][a-z]{2,}$";

        System.out.println(
            validate(lastName,lastNameRegex)
                ?"Valid last Name"
                :"Invalid last name"
        );

        //e-mail check
        System.out.print("Enter Email: ");

        String [] emailSamples = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com",
             "abc",                     // must contain '@'
            "abc@.com.my",              // tld cannot start with dot
            "abc123@gmail.a",           // last tld must have at least 2 characters
            "abc123@.com",              // tld cannot start with dot
            "abc123@.com.com",          // tld cannot start with dot
            ".abc@abc.com",             // email cannot start with dot
            "abc()*@gmail.com",         // only allowed characters
            "abc@%*.com",               // only allowed characters
            "abc..2002@gmail.com",      // double dots not allowed
            "abc.@gmail.com",           // last character cannot be dot
            "abc@abc@gmail.com",        // double '@' not allowed
            "abc@gmail.com.1a",         // tld with two characters cannot contain digit
            "abc@gmail.com.aa.au"       // multiple email tld not allowed
        };
        
        String emailRegex = "^(?!.*\\.\\.)(?!\\.)(?!.*\\.$)[a-zA-Z][a-zA-Z0-9+_-]*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";

        System.out.println("\nEmail Sample Validation (UC9):");
        for (String sample : emailSamples) {
            System.out.println(sample + " -> " +
                    (validate(sample, emailRegex) ? "Valid" : "Invalid"));
        }

        //mobile Number validation
        System.out.print("Enter Mobile Number (CC XXXXXXXXXX): ");
        String mobileNumber = sc.nextLine();
        String mobileNumberRegex = "^[0-9]{2} [0-9]{10}$";

        System.out.println(
            validate(mobileNumber,mobileNumberRegex)
                ?"Valid Mobile Number"
                :"Invalid Mobile Number"
        );

        //validate passoword UC8 - Exactly one special character
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=(?:.*[@#$%^&+=!]){1}).{8,}$";

        System.out.println(
            validate(password,passwordRegex)
                ?"Valid Password"
                :"Invalid Password"
        );
    }
}