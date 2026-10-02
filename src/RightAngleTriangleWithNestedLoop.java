import java.util.Scanner;

public class RightAngleTriangleWithNestedLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of your triangle:");
        int height = sc.nextInt();
//        System.out.println("Enter the base of your triangle:");
//        int base = sc.nextInt();   ---------------Unable to figure out how to use the base

        for(int i=0; i<height; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
