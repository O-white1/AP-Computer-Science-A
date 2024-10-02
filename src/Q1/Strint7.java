package Q1;
import java.util.Scanner;

public class Strint7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Word:");
        String word = sc.nextLine().toLowerCase().trim();

        int Vcount = 0;
        int Ccount = 0;

        for (int lcv = 0; lcv < word.length(); lcv++) {
            char cur = word.charAt(lcv);
            if (cur == 'a' || cur == 'e' || cur == 'i' || cur == 'o' || cur == 'u')
                Vcount++;
            else if (cur != ' ')
                Ccount++;
        }
    System.out.printf("Number of Vowels: %d\t\t Number of Consonants: %d\n", Vcount, Ccount);
    }
}
