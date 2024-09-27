package Q1;
import java.util.Scanner;

public class Strint1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase();

        for (int lcv = 0; lcv < str.length(); lcv++) {
            for (int lcv2 = lcv+1; lcv2 < str.length(); lcv2++) {
                String let1 = str.substring(lcv, lcv+1);
                String let2 = str.substring(lcv2, lcv2+1);

                if (let1.equals(let2)) { // must use .equals because it's a nonNatives type
                    System.out.print(let2 + " ");
                    break; // leaves innermost loop.  NOT IN AP SUBSET
                }
            }
        }
        System.out.print("Duplicate chars: ");


    }
}
