package Q1.Prog82aCl;
import java.util.Scanner;

public class Prog82a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Speed Limit: ");   int SpeedLimit = sc.nextInt();
        System.out.println("Enter Vehicle Speed: "); int VehicleSpeed = sc.nextInt();

        cl82a calc = new cl82a(SpeedLimit, VehicleSpeed);
        calc.Calc();

        double Charge = calc.GetCharge();
        System.out.println("Charge is: " + Charge);


    }
}
