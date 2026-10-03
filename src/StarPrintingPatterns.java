import java.util.Scanner;

public class StarPrintingPatterns {

    public static void main(String[] args) {
        System.out.println("\n********************************************************");
        System.out.println("Welcome to pattern printing questions");
        System.out.println("\n********************************************************");

        // Pattern 1 --- spaces and stars to make a right angle triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 2 ---- Inverted Right angle triangle

//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Pattern 3
//
//        for (int i=1; i<=n; i++){
//            for (int j=0; j<=i-1; j++){
//                System.out.print(" ");
//            }
//            for (int j=i; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n-1; i<n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
