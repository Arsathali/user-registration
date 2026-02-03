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


    }
}