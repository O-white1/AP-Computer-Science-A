package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();
            int cowRows = file.nextInt();
            int cowPens = file.nextInt();

            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name   = file.next();
                    int weight    = file.nextInt();
                    int milk      = file.nextInt();
                    int hayEaten  = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name   = file.next();
                    int weight    = file.nextInt();
                    int hayEaten  = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            //TODO: Report income of the day, cumulative weight of all animas
            //TODO: if theres enough food to feed all, cow that makes most money

            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseVal = horse.value(cornCost, hayCost);
                    if (horseVal < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseVal;
                    }
                }

            }
            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());


        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
