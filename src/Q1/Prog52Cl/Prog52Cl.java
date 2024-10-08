package Q1.Prog52Cl;
import java.util.Scanner;

public class Prog52Cl { // Driver class / main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: "); int l = sc.nextInt();
        System.out.println("Enter Width: ");  int w = sc.nextInt();

        cl52a wow = new cl52a(l, w);
        wow.Calc();
        int area  = wow.getArea();
        int perim = wow.getPerim();

        System.out.printf("Area: %d\n", area);
        System.out.printf("perim: %d\n", perim);


    }
}
