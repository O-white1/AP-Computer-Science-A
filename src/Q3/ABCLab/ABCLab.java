package Q3.ABCLab;

import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("C radius: ");double r = kbd.nextDouble();
        Shape s1 = new Circle(r);

        System.out.println("R height: ");double rh = kbd.nextDouble();
        System.out.println("R width: ");double rw = kbd.nextDouble();
        Shape s2 = new Rectangle(rh, rw);

        System.out.println("R height: ");double th = kbd.nextDouble();
        System.out.println("R width: ");double tb = kbd.nextDouble();
        Shape s3 = new Triangle(th, tb);

        ((Circle) s1).printClass();
        ((Circle) s1).calcCircumference();

        ((Rectangle) s2).printClass();
        s2.calcArea();
        s2.calcPerimeter();

        ((Triangle) s3).printClass();
        s3.calcArea();
        s3.calcPerimeter();

    }
}
