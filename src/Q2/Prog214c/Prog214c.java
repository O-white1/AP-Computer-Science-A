package Q2.Prog214c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));
            ArrayList<Transaction> transactions = new ArrayList<>();

            while (file.hasNext()) {
                String   line    = file.nextLine();
                String[] tokens  = line.split("\\s+"); // badass regex shiiiiit.
                char type        = tokens[0].charAt(0);
                double gallons   = Double.parseDouble(tokens[1]);
                boolean wash     = (tokens[2].equals("Y"));
                Transaction sale = new Transaction(type,gallons, wash);
                sale.calc();
                transactions.add(sale);
            }
            for (Transaction t : transactions)
                t.print();
         }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
