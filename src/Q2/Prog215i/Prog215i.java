import Q2.Prog215i.cl215i;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog215i {
    public static void main(String[] args) {
        ArrayList<cl215i> list = new ArrayList<cl215i>();
        try {
            Scanner file = new Scanner(new File("Langdat/prog215i.dat"));
            while (file.hasNext()) {

                int vehicle     = file.nextInt();
                if (vehicle==0) break;
                double miles    = file.nextDouble();
                double gallons  = file.nextDouble();
                list.add(new cl215i(vehicle, miles, gallons));

            }

            cl215i best  = list.get(0);
            cl215i worst = list.get(1);

            for (int lcv = 0; lcv < list.size()-1; lcv++) {
                if (list.get(lcv).getCode()>best.getCode())
                    best = list.get(lcv);

                if (list.get(lcv).getCode()<worst.getCode())
                    worst = list.get(lcv);

            }
            double AvgMpg = 0;
            for (cl215i c : list)
                AvgMpg += c.getMPG();

            AvgMpg /= list.size();

            System.out.println("Vehicle code\tMiles\tGallons\tMPG");
            for (cl215i c : list) {
                System.out.println(c.getCode()+"\t\t"+c.getMiles()+"\t\t"+c.getGallons()+"\t\t"+ c.getGallons()+"\t\t"+c.getMPG());
            }
            System.out.println("Best: " + best);
            System.out.println("Worst: " + worst);
            System.out.println("Fleet AVG: " + AvgMpg);
            System.out.println("Number of Vehicles: " + list.size());



        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
