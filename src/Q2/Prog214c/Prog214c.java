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

                Transaction sale = new Transaction(tokens[0].charAt(0), Double.parseDouble(tokens[1]), (tokens[2].equals("Y")));
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
