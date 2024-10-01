package Q1;
import java.util.Scanner;

public class Strint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase();

        for (int lcv = 0; lcv < str.length(); lcv++) {
            String c = str.substring(lcv, lcv+1);

            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("The First non repeating char is: " + c);
                break;
            }
        }
    }
}
