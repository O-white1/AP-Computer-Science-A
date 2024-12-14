package Q2.Prog215h;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215h.txt"));
            ArrayList<Contestant> contestants = new ArrayList<>();

            while (file.hasNext()) {
                double[] scores = new double[8];
                for (int i = 0; i < 8; i++)
                    scores[i] = file.nextDouble();
                Contestant c = new Contestant(scores);
                c.calc();
                contestants.add(c);
            }
            for (Contestant c : contestants) c.print();
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
