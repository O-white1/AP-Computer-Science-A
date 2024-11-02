package Q1;
import java.util.Scanner;

public class lpFive_Six {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: "); String num = sc.nextLine();
        for (int lcv = 0; lcv < num.length(); lcv++) {
            sum += Character.getNumericValue(num.charAt(lcv));
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
