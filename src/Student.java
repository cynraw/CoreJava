public class Student {

    protected int idNo;
    protected String name;
    protected String studentClass;

    public void display(){
        System.out.println("Student " + name + " has id number " + idNo + " and is in grade " + studentClass + ".");
    }
}

class mainStudent{
    public static void main(String[] args){
        Student student1 = new Student();
        student1.idNo = 1;
        student1.name = "Chep";
        student1.studentClass = "grade 10";

        student1.display();
    }
}
