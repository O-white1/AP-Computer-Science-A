package Q1;
import java.util.Scanner;

public class lpFour_One {
    public static void main(String[] args) {

        System.out.println("Enter Number of copies: ");
        int copies = new Scanner(System.in).nextInt();

        double total = 0;
        double price = 0;

        if (copies > 0 && copies <= 99)     price = 0.30;
        if (copies > 100 && copies <= 499)  price = 0.28;
        if (copies > 500 && copies <= 750)  price = 0.27;
        if (copies > 750 && copies <= 1000) price = 0.26;
        if (copies > 1000)                  price = 0.25;

        total = price*copies;
        System.out.println("Total Price: " + total);
    }
}
