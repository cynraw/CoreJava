import java.util.Scanner;

public class InputValidationWithWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 50");
        int num = num=sc.nextInt();

        while(num<=0 || num>=50){
            System.out.println("You have entered an invalid number. Please enter a valid number");
            num=sc.nextInt();
        }

        System.out.println("You have entered "+ num + " this is a valid number.");

    }
}
