package Q1;
import java.util.Scanner;

public class Prog82a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;

        System.out.print("Enter Speed limit: ");   int SpeedLimit = sc.nextInt();
        System.out.print("Enter Vehicle Speed: "); int VehicleSpeed = sc.nextInt();
        int SpeedOverLimit = VehicleSpeed - SpeedLimit;
        double charge = 20 + (SpeedOverLimit * 5.0);

        System.out.println("Charge is: $" + charge);
    }
}
