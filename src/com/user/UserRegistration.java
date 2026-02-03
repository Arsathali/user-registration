import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static boolean validate(String input , String regex){
        return Pattern.matches(input,regex);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //first name
        String firstName = sc.nextLine();
        String firstNameRegex = "^[A-Z][a-z]{2,}$";

        System.out.println(
            validate(firstName,firstNameRegex)
                ?"Valid First Name"
                :"Invalid First name"
        );

        //last name
        String lastName = sc.nextLine();
        String lastNameRegex = "^[A-Z][a-z]{2,}$";

        System.out.println(
            validate(lastName,lastNameRegex)
                ?"Valid last Name"
                :"Invalid last name"
        );

        //e-mail check
        String email = sc.nextLine();
        String emailRegix = "^[a-z]+(\\.[a-z]+)?@[a-z]+\\.co(\\.[a-z]+)?$";

        System.out.println(
            validate(email,emailRegix)
                ?"Valid Email Id"
                :"Invalid Email Id"
        );

    }
}