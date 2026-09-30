import java.util.Scanner;

public class PasswordValidatorWithDoWhile {

    public static void main(String[] args) {
        String validPassword = "WorldcapisDeal12";
        Scanner sc = new Scanner(System.in);
        boolean isEquals;

        do {
            System.out.println("Please enter the valid password");
            String inputPassword = sc.next();
            isEquals = validPassword.equals(inputPassword);
        }while(!isEquals);

        System.out.println("Welcome Home.");
    }
}
