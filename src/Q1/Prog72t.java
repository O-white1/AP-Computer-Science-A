package Q1;
import java.util.Scanner;

public class Prog72t {
    public static void main(String[] args) {
        Scanner TimeIn = new Scanner(System.in);

        System.out.println("Enter Military time1: ");
        int Time1 = TimeIn.nextInt();

        System.out.println("Enter Military time2: ");
        int Time2 = TimeIn.nextInt();

        int TimeOneHours   = Time1 / 100;
        int TimeOneMinutes = Time1 % 100;
        int TimeTwoHours   = Time2 / 100;
        int TimeTwoMinutes = Time2 % 100;
        int DifHours   = Math.abs(TimeOneHours   - TimeTwoHours);
        int DifMinutes = Math.abs(TimeOneMinutes - TimeTwoMinutes);

        System.out.printf("Time difference: %d hours, and %d minutes", DifHours, DifMinutes);
    }
}
