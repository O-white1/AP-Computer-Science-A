package Q1;
import java.util.Scanner;

public class lpFour_Three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of eggs: ");

        int eggs = sc.nextInt();
        int dozens = eggs / 12;
        int remEggs = eggs % 12;
        double price = 0;

        if (dozens >= 0 && dozens < 4) price = 0.50;
        if (dozens >= 4 && dozens < 6) price = 0.45;
        if (dozens >= 6 && dozens < 11) price = 0.40;
        if (dozens >= 11)              price = 0.35;

        double total = (dozens * price) + (remEggs * (price / 12));

        System.out.println("Total price: " + total);
    }
}
