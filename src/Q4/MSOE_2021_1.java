package Q4;
import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letter: "); String letter = sc.nextLine();
        System.out.println("Enter Sentence"); String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.endsWith(letter)) {
                System.out.println(word);
                break;
            }
        }
    }
}
