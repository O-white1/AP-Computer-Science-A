package Q3.Prog701g;

public class Student extends Person {
    private double myGpa;

    public Student(String fn, String ln,double gpa) {
        super(fn, ln);
        myGpa = gpa;
    }

    public double getGPA() {return myGpa;}
}
