public class AddSubCalc {

    protected int a;
    protected int b;

    public AddSubCalc(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int addCalculator(){
      return a+b;
    }

    public int subtractCalculator(){
        return a-b;
    }

    public static void main(String[] args) {
        AddSubCalc calc1 = new AddSubCalc(23, 20);
        int sum = calc1.addCalculator();
        System.out.println("The sum is: " + sum);

        int difference = calc1.subtractCalculator();
        System.out.println("The difference is: " + difference);
    }
}
