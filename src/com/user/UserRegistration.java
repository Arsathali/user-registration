import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    static boolean validate(String input , String regex){
        return Pattern.matches(input,regex);
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
        String email = sc.nextLine();
        String emailRegex = "^[a-z]+(\\.[a-z]+)?@[a-z]+\\.co(\\.[a-z]+)?$";

        System.out.println(
            validate(email,emailRegex)
                ?"Valid Email Id"
                :"Invalid Email Id"
        );

        //mobile Number validation
        System.out.print("Enter Mobile Number (CC XXXXXXXXXX): ");
        String mobileNumber = sc.nextLine();
        String mobileNumberRegex = "^[0-9]{2} [0-9]{10}$";

        System.out.println(
            validate(mobileNumber,mobileNumberRegex)
                ?"Valid Mobile Number"
                :"Invalid Mobile Number"
        );

        //validate passoword UC6 - atlease 1 uppercase
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        String passwordRegex = "^(?=.*[A-Z]).{8,}$";

        System.out.println(
            validate(password,passwordRegex)
                ?"Valid Password"
                :"Invalid Password"
        );
    }
}