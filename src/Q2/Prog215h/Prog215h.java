package Q2.Prog215h;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("langdat/prog215h.txt"));
            ArrayList<Double> allScores = new ArrayList<>();
            Contestant Alice = new Contestant();

            while (file.hasNext())
                allScores.add(file.nextDouble());

            //TODO: all 6 contestants
            for (int lcv=0; lcv<=8; lcv++) {
                Alice.myScores[lcv] = allScores.get(lcv);
            }

            Alice.calc();

        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
