public class PositiveIf {

    public boolean positiveNumber(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PositiveIf number1 = new PositiveIf();

        boolean isNumberPositive = number1.positiveNumber(24);
        System.out.println(isNumberPositive);
    }
}
