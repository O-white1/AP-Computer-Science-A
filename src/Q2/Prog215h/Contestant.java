package Q2.Prog215h;

import java.util.ArrayList;

public class Contestant {
    private double[] myScores;
    private double sum;
    private double avg;

    public Contestant(double[] scores) {
        sum = 0;
        avg = 0;
        myScores = scores;
    }

    public void calc() {
        for (double x :myScores) sum += x;
        avg = sum/myScores.length;
    }
    public void print() {
        System.out.println("\nScores: ");
        for (double score : myScores)
            System.out.print("\t" + score + " ");
        System.out.println("\nAverage: " + avg);
    }
}
