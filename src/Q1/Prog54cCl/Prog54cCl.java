package Q1.Prog54cCl;
import java.util.Scanner;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius = sc.nextDouble();

        cl54c calc = new cl54c(radius);
        calc.Calc();

        double Circ = calc.GetCirc();
        double Area = calc.GetArea();

        System.out.println("Area of Circle is " + Area);
        System.out.println("Circumference of Circle is " + Circ);
    }
}
