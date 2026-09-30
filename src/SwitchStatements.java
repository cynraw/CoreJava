import java.util.Scanner;
//LETS COMPARE THE EFFICIENCY OF SWITCH VS IF-ELSE STATEMENTS
public class SwitchStatements {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day choice!");
        }
        
//        if(choice==1){
//            System.out.println("Monday");
//        } else if (choice==2) {
//            System.out.println("Tuesday");
//        } else if (choice==3) {
//            System.out.println("Wednesday");
//        } else if (choice==4) {
//            System.out.println("Thursday");
//        } else if (choice==5) {
//            System.out.println("Friday");
//        } else if (choice==6) {
//            System.out.println("Saturday");
//        } else if (choice==7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid day choice!");
//        }

    }
}
