package Q2.LPThree_Nine;
import java.util.Scanner;

public class LP3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Birthday:");
        System.out.print("\n\tYear: ");  int year  = sc.nextInt();
        System.out.print("\n\tMonth: "); int month = sc.nextInt();
        System.out.print("\n\tDay: ");   int day   = sc.nextInt();

        System.out.println("Enter Today's date:");
        System.out.print("\n\tYear:");  int ThisYear  = sc.nextInt();
        System.out.print("\tMonth:");   int ThisMonth = sc.nextInt();
        System.out.print("\tDay:");     int ThisDay   = sc.nextInt();

        clLp3_9 goober = new clLp3_9(year, month, day, ThisYear, ThisMonth, ThisDay);

        goober.calc();
        int DifYears   = goober.getYear();
        int DifMonths  = goober.getMonth();
        int DifDays    = goober.getDays();
        int sleepHours = goober.getSleeps();

        System.out.printf("You are %d years, %d months, and %d days old", DifYears, DifMonths, DifDays);
        System.out.printf("\nYou should have slept for %d hours", sleepHours);

    }
}
