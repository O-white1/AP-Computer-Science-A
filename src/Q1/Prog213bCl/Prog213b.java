package Q1.Prog213bCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog213b.txt"));
            while (file.hasNext()) {
                int quantity = file.nextInt();
                cl213b wow = new cl213b(quantity);
                wow.calc();
                System.out.println(wow);
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
