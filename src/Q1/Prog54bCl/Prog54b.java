package Q1.Prog54bCl;
import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: "); int n1 = sc.nextInt();
        System.out.println("Enter Number 2: "); int n2 = sc.nextInt();

        cl54b calc = new cl54b(n1,n2);
        calc.Calc();

        int sum = calc.GetSum();
        int avg = calc.GetAvg();

        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
    }

}
