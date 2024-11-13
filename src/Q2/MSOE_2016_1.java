package Q2;
import java.util.Scanner;

public class MSOE_2016_1 {
    public static void main(String[] args) {
        boolean pal = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");String word = sc.nextLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (!word.substring(i, i + 1).equals(word.substring(word.length() - i, word.length()-i+1))) {
                pal = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + pal);
    }
}
