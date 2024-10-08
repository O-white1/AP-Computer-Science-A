package Q1.Prog76aCl;
import java.util.Scanner;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number you hate(1-9): ");
        int num = sc.nextInt();

        cl76a yep = new cl76a(num);
        yep.Calc();

        num = yep.getNum();
        System.out.printf("Surprise: %d\n", num);



        System.out.println();


    }

}
