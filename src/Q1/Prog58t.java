package Q1;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Prog58t {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double price, pay, rem;
        int dollars = 0, quarters = 0, dimes = 0, nickles = 0, pennies = 0;

        System.out.println("Enter Price: "); price = in.nextDouble();
        System.out.println("Enter Pay:"   ); pay   = in.nextDouble();

        rem = pay - price;
        if (pay < price) {
            System.out.println("BROKIE");
        }
        while (rem >= 1.0) {
            dollars += 1;
            rem -= 1.0;
        }
        while (rem >= 0.25) {
            quarters += 1;
            rem -= 0.25;
        }
        while (rem >= 0.1) {
            dimes += 1;
            rem -= 0.1;
        }
        while (rem >= 0.05) {
            nickles += 1;
            rem -= 1;
        }
        while (rem >= 0.01) {
            pennies += 1;
            rem -= 0.01;
        }

        System.out.println("Dollars: "  + dollars  +  "\n");
        System.out.println("Quarters: " + quarters +  "\n");
        System.out.println("Dimes: "    + dimes    +  "\n");
        System.out.println("Nickles: "  + nickles  +  "\n");
        System.out.println("Pennies: "  + pennies  +  "\n");
    }
}
