public class Car {

    protected String model;
    protected int year;
    protected String color;

    public Car(String model,int year,String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void display(){
        System.out.println("This is a " + model + " " + year + " in the color " + color);
    }
}

class MainCar{
    public static void main(String[] args){
        Car car1 = new Car("Toyota Mazda", 2024, "Magenta");

        car1.display();
    }
}
