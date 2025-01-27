package Q2.Prog215i;

import Q2.ArrayListTest;
import Q3.Prog505a.Nerd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("LANGDAT/FILENAME"));
            List<Nerd> list = new ArrayList<Nerd>();
            while (file.hasNext()) {
                String fname = file.next();
                String lName = file.next();
                String name = fname + " " + lName;
                int books = file.nextInt();
                list.add(new Nerd(name, books));
            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                Nerd current = list.get(lcv);
                current.calc();
            }
            System.out.println("Reading Contest:\nName:\tBooks\tPoints");
            for (Nerd n : list) {
                System.out.println(n);
            }
            double tot = 0;
            for (Nerd n : list) tot += n.getPoints();
            double avg = tot/list.size();

            System.out.println("Average Points: " + avg);


            int bestPoints = list.get(0).getPoints();
            String bestName = list.get(0).getName();

            for (int lcv = 1; lcv < list.size(); lcv++) {
                Nerd Keith = list.get(lcv);
                if (Keith.getPoints() > bestPoints) {
                    bestPoints = Keith.getPoints();
                    bestName   = Keith.getName();
                }
                System.out.println("The Winner is: " + bestName);
            }

        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}