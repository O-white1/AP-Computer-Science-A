package Q1;
import java.util.Scanner;

public class lpFive_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer: "); String number = sc.nextLine();
        for (int lcv = 0; lcv < number.length(); lcv++) {
            System.out.println(number.charAt(lcv));
        }
    }
}
