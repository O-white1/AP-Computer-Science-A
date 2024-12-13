package Q2.Prog215h;

import java.util.ArrayList;

public class Contestant {
    public double[] myScores;
    private double sum;
    private double avg;

    public Contestant() {
        sum = 0;
        avg = 0;
    }

    public void calc() {
        for (double x:myScores)sum += x;
        avg = sum/myScores.length;
    }
    public double getAverage() {return avg;}
    public double[] getScores() {return myScores;}

}
