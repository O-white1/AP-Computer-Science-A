package Q2;

import java.util.Scanner;

public class MSOE_2016_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Side A"); double sideA  = sc.nextDouble();
        System.out.println("Enter Length of Side C"); double sideC  = sc.nextDouble();
        System.out.println("Enter Angle of Side A");  double angleA = sc.nextDouble();

        double angleC = Math.sin(sideC) / (Math.sin(sideA) / angleA);
        System.out.printf("The Degree angle of C is %.2f", angleC);
    }
}
