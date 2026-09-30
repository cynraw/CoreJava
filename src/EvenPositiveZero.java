public class EvenPositiveZero {

    public String numberCheck(int num){
        if(num > 0){
            return "The number is positive";
        }
        else if(num < 0){
            return "The number is negative";
        }
        return "The number is Zero";
    }

    public static void main(String[] args) {
        EvenPositiveZero number1 = new EvenPositiveZero();

        String num = number1.numberCheck(90);
        System.out.println(num);
    }
}
