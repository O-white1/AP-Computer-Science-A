package Q1;
import java.util.Scanner;

public class Prog93a {
    public static void main(String[] args) {
        double cpkwh = 0.0475;
        double bill = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of bill: "); double kwUsed = sc.nextDouble();

        bill += kwUsed*cpkwh;
        double surcharge = bill * 0.1;
        double cityTax = bill * 0.03;
        System.out.println("Base Rate: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("City Tax: " + cityTax);
        bill += surcharge + surcharge + cityTax;
        double latebill = bill + bill*0.03;
        System.out.println("Bill: " + bill);
        System.out.println("Late Bill: " + latebill);

    }
}
