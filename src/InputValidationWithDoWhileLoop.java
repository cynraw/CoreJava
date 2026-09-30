import java.util.Scanner;

public class InputValidationWithDoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter a number between 1 and 50");
            num = sc.nextInt();
            if(num < 1 || num > 50){
                System.out.println("Invalid Number");
            }
        } while (num < 1 || num > 50);

        System.out.println("You have entered "+ num + " this is a valid number.");
    }
}
