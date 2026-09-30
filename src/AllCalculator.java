import java.util.Scanner;

public class AllCalculator {

    public double simpleCalc(int a, int b, char operator){
        if(operator == '+'){
            return a+b;
        }
        else if(operator == '-'){
            return a-b;
        }
        else if(operator == '*'){
            return a*b;
        }
        else if(operator == '/'){
            return (double) a /b;
        }
        else{
            return 0d;
        }
    }

    public static void main(String[] args) {
        int a, b;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a=sc.nextInt();
        System.out.println("Enter the second number: ");
        b=sc.nextInt();
        System.out.println("Enter the symbol of the operation you want to perform: ");
        operator=sc.next().charAt(0);

        AllCalculator calculation1 = new AllCalculator();
        double value = calculation1.simpleCalc(a,b,operator);
        System.out.println("The output of your calculation is: " + value);
    }
}
