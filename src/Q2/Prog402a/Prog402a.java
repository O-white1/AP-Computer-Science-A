package Q2.Prog402a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
            ArrayList<cl402a> list = new ArrayList<>() ;
            double avg = 0;

            while (file.hasNext()) {
                int id    = file.nextInt();
                int score = file.nextInt();
                list.add(new cl402a(id, score));
            }

            System.out.println("Id  Score  Dif");
            for (cl402a c : list) {avg += c.getScore();} avg /= list.size();
            for (cl402a c : list)
                System.out.printf("%d\t%d\t%.2f\n", c.getId(), c.getScore(), avg - c.getScore());
            System.out.println("Average: " + avg);

        }

        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
