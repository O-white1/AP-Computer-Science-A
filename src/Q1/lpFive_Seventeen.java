package Q1;
import java.util.Scanner;

public class lpFive_Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean in = false;
        for (int lcv = 0; lcv< 3; lcv++) {
            System.out.println("Enter Password: ");
            String Attempt = sc.nextLine();

            if (Attempt.equals("7dd3lc&h&d")) {
                System.out.println("Welcome!");
                in = true;
                break;
            }
            else {
                System.out.println("Password is wrong");
                continue;
            }
        }
        if (!in) {
            System.out.println("Access denied.");
        }
    }
}
