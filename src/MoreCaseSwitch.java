import java.util.Scanner;

public class MoreCaseSwitch {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        choice = sc.nextInt();

        switch (choice){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday...");
                break;
            case 6: case 7:
                System.out.println("Weekend!!!");
                break;
            default:
                System.out.println("Invalid day choice!");
        }
    }
}
