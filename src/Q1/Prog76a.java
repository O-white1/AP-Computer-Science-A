package Q1;
import java.util.Scanner;

public class Prog76a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A very dumb integer between 1-9");
        int num = sc.nextInt();
        int num2 = (num*9)*12345679;

        System.out.println(num2 + " Suprise!");
    }
}
