package Q1.Prog93aCl;
import java.util.Scanner;

public class Prog93a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of bill: "); int kwh = sc.nextInt();

        cl93a Helper = new cl93a(kwh);
        Helper.calc();
        System.out.println(Helper);


    }
}
