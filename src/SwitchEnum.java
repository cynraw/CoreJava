import java.util.Scanner;

public class SwitchEnum {

    public static void main(String[] args) {
        enum Day {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        Day day = Day.valueOf(sc.next());
        switch (day){
            case Monday : case Tuesday: case Wednesday: case Thursday: case Friday:
                System.out.println("Week day!");
                break;
            case Saturday: case Sunday:
                System.out.println("Weekend!!!!!!");
                break;
            default:
                System.out.println("Invalid day choice");
        }
    }
}
