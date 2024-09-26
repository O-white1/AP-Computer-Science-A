package Q1;
import java.util.Scanner;

public class Prog65h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of Pounds");
        int Pounds = sc.nextInt();

        System.out.println("Enter the amount of Shillings");
        int Shillings = sc.nextInt();

        System.out.println("Enter the amount of Pence");
        int Pence = sc.nextInt();

        int TotalOldPence = (Pounds * 240) + (Shillings * 12) + Pence;
        double NewPounds = TotalOldPence / 240.0 * 100;

        int intPounds = (int) NewPounds / 100;
        int newPence = (int) NewPounds % 100;

        // Output the result
        System.out.printf("Equivalent in new currency: £%d.%02d%n", intPounds, newPence);




    }
}
