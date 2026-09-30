public class Lec4Variables {

    protected int count;
    protected double pi = 3.14;
    protected boolean isJavaFun;

    public Lec4Variables(int count, boolean isJavaFun){
        this.count = count;
        this.isJavaFun = isJavaFun;
    }

    public void display(){
        System.out.println("These are my integer "+ count + " , double "+ pi + " and boolean " + isJavaFun);
    }

    public static void main(String[] args){
        Lec4Variables myVariable1 = new Lec4Variables(102, true);

        myVariable1.display();
    }
}
