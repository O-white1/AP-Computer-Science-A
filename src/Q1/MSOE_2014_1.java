package Q1;
import java.util.Locale;
import java.util.Scanner;

public class MSOE_2014_1 {
    public static void main(String[] args) {

        Scanner kbb = new Scanner(System.in);

        System.out.println("Enter Word: ");
        String word = kbb.nextLine().toLowerCase();
        int dlbcount = 0;

        for (int lcv = 0; lcv < word.length()-1; lcv++) {
            String cletter = word.substring(lcv, lcv+1); // word[lcv]
            String nletter = word.substring(lcv+1, lcv+2); // word[lcv+1]
            if (cletter.equals(nletter))
                dlbcount++;
        }
        System.out.printf("%s contains %d double letters\n", word, dlbcount);

    }
}
