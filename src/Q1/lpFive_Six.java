package Q1;
import java.util.Scanner;

public class lpFive_Six {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer: "); String number = sc.nextLine();
        for (int lcv = 0; lcv < number.length(); lcv++) {
            sum +=number.substring(lcv, lcv + 1); // same as charAt(lcv)
        }
    }
}
