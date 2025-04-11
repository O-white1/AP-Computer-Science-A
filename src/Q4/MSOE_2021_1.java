package Q4;
import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter: ");char l = sc.nextLine().charAt(0);
        System.out.println("Enter letter: ");char l2 = sc.nextLine().charAt(0);
        System.out.println("Enter Sentence: ");String s = sc.nextLine();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length()-1; j++) {
                if ((word.charAt(j)==l)&&(word.charAt(j+1)==l2)) {
                    System.out.printf("Match found in word %s with %c and %c%n\n", word, l, l2);
                    cnt++;
                }
                if ((word.charAt(j)==l2)&&(word.charAt(j+1)==l)) {
                    System.out.printf("Match found in word %s with %c and %c%n\n", word, l2, l);
                    cnt++;
                }

            }
        }
        System.out.println("Total matches: " + cnt);
    }
}
