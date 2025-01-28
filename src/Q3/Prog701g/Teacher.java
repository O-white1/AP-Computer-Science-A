package Q3.Prog701g;

public class Teacher extends Person {
    private int myNumStus;

    public Teacher(String ln, String fn, int numStu) {
        super(ln, fn);
        myNumStus = numStu;
    }
    public int getMyNumStus() {return myNumStus;}
}
