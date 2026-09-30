import java.util.Scanner;

public class MaxOfTwoNumbers {

    public int maxOfTwo(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();

        MaxOfTwoNumbers check1 = new MaxOfTwoNumbers();
        int maxOfCheck1 = check1.maxOfTwo(num1, num2);
        System.out.println("The max of the two numbers is: " + maxOfCheck1);
    }
}
