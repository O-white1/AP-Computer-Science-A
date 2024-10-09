package Q1;
import java.util.Scanner;

public class lpFour_Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: "); double angle = sc.nextDouble();

        double sin = Math.sin(Math.toRadians(angle)); System.out.println("Sine: " + sin);
        double cos = Math.cos(Math.toRadians(angle)); System.out.println("Cosine: " + cos);
        double tan = Math.tan(Math.toRadians(angle)); System.out.println("Tangent: " + tan);


    }
}
