import Q1.Prog285bCl.Saleseperson;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Prog285bCl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog285b.dat"));
            System.out.println("Id\tCode\tSales\tCommission");
            while (file.hasNext()) {

                int id   = file.nextInt();
                int c    = file.nextInt();
                double s = file.nextDouble();
                Saleseperson fred = new Saleseperson(id, c, s);
                fred.setComm();
                System.out.println(fred);
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
