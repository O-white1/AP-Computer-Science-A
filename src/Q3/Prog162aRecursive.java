package Q3;

import java.util.Scanner;

public class Prog162aRecursive {

    public static int factLoop(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++)
            p *= i;
        return p;
    }
    public static int factRevLoop(int n) {
        int p = 1;
        for (int i = n; i >= 1; i--)
            p *= i;
        return p;
    }
    public static int factorial(int n) {
        return(n <= 1) ? (1): (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter number: "); int num = keys.nextInt();

        while (num != 0) {
            int fact = factLoop(num);
            System.out.println(num + "!=" + fact);
            System.out.print("Enter number: ");
            num = keys.nextInt();
        }
    }
}
