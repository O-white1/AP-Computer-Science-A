package Q1;
import java.util.Scanner;

public class Strint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String word = sc.nextLine().toLowerCase();

        System.out.println("Enter a String: ");
        String word2 = sc.nextLine().toLowerCase();

        if (word.length() != word2.length()) {
            System.out.println("Not anagrams :(");
        }
        else {
            for (int lcv = 0; lcv < word.length(); lcv++) {
                String c = word.substring(lcv, lcv + 1);
                int i = word2.indexOf(c);
                if (i != -1) {
                    word2 = word2.substring(0, i) + word2.substring(i + 1);
                }
                else {
                    System.out.println("Not anagrams :(");
                    break;
                }
            }
        }
        System.out.println("Are the Strings anagrams?: " + word2.isEmpty());
    }
}
