import java.util.Scanner;

public class MenuDrivenCalcWithDoWhile {

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        return a/b;
    }

    public int modulus(int a, int b){
        return a%b;
    }

    public static void main(String[] args) {
        MenuDrivenCalcWithDoWhile menu1 = new MenuDrivenCalcWithDoWhile();
        Scanner sc = new Scanner(System.in);
        int choice;
        int result;
        do {
            System.out.println("\n***************************************************");
            System.out.println("Welcome to my Calculator! \uD83E\uDDEE");
            System.out.println("\n***************************************************");

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.println("Please select your choice of operation you want to perform");
            choice = sc.nextInt();

            System.out.println("Enter the first number to perform operation on: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number to perform operation on: ");
            int num2 = sc.nextInt();

            switch (choice){
                case 1:
                    result = menu1.addition(num1, num2);
                    System.out.println("Addition of "+ num1+ " and " + num2 + " is " + result);
                    break;
                case 2:
                    result = menu1.subtraction(num1, num2);
                    System.out.println("Subtraction of "+ num1+ " and " + num2 + " is " + result);
                    break;
                case 3:
                    result = menu1.multiplication(num1, num2);
                    System.out.println("Multiplication of "+ num1+ " and " + num2 + " is " + result);
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("Dividing a number by 0 is not allowed!");
                    }else{
                        result = menu1.division(num1, num2);
                        System.out.println("Division of "+ num1+ " and " + num2 + " is " + result);
                    }
                    break;
                case 5:
                    result = menu1.modulus(num1, num2);
                    System.out.println("Modulus of "+ num1+ " and " + num2 + " is " + result);
                    break;
                case 6:
                    System.out.println("Exiting the calculator. \uD83D\uDC4B");
                    break;
                default:
                    System.out.println("Invalid choice of operation. Please enter a number between 1 and 6");
                    break;
            }
        }while(choice!=6);
    }
}
