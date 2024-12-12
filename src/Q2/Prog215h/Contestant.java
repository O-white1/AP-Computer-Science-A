package Q2.Prog215h;

import java.util.ArrayList;

public class Contestant {
    public ArrayList<Double> myScores;
    private double sum;

    public Contestant() {
        sum = 0;
    }

    public void calc() {
        for (double x:myScores)sum += x;
    }
    public double getAverage() {return sum/myScores.size();}
    public ArrayList<Double> getScores() {return myScores;}

}
