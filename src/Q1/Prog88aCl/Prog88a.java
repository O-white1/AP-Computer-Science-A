package Q1.Prog88aCl;
import java.util.Scanner;

public class Prog88a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: "); int num1 = sc.nextInt();
        System.out.println("Enter Num2: "); int num2 = sc.nextInt();

        cl88a Cl = new cl88a(num1, num2);
        Cl.Calc();
        // :(
        int    sum  = Cl.GetSum();
        int    dif  = Cl.GetDif();
        int    prod = Cl.GetProd();
        int    dist = Cl.GetDist();
        int    max  = Cl.GetMax();
        int    min  = Cl.GetMin();
        double avg  = Cl.GetAvg();

        // D:
        System.out.println("Sum: " + sum);
        System.out.println("Dif: " + dif);
        System.out.println("Prod: " + prod);
        System.out.println("Dist: " + dist);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);

    }
}
