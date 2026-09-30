public class Grades {

    protected int score;

    public Grades(int score){
        this.score = score;
    }

    public String gradeCalculator(){
        if(score >= 90 && score <= 100){
            return "A";
        }
        else if (score >= 80 && score <=89) {
            return "B";
        }
        else if(score >= 70 && score <= 79){
            return "C";
        }
        else if(score >= 60 && score <= 69){
            return "D";
        }
        else if (score >= 0 && score <= 59) {
            return "E";
        }
        else {
            return "Invalid Grade!";
        }
    }

    public static void main(String[] args) {
        Grades student1 = new Grades(8);

        student1.gradeCalculator();
        System.out.println("student grade is = " + student1.gradeCalculator());
    }
}
