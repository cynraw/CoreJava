import java.util.Scanner;

public class SeniorDiscount {

    public boolean eligibleForSeniorDiscount(int age){
        if(age >= 65){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SeniorDiscount person1 = new SeniorDiscount();
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age of the person: ");
        age = sc.nextInt();

        boolean isPersonEligibleForSeniorDiscount = person1.eligibleForSeniorDiscount(age);
        System.out.println(isPersonEligibleForSeniorDiscount);
    }
}
