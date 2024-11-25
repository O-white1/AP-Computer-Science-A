package Q2;
import java.util.Scanner;

public class Strint6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: "); String str = sc.nextLine().toUpperCase();
        String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] count = new int[ab.length()]; // 26

        for (int j = 0; j < str.length(); j++)
            for (int k = 0; k < ab.length(); k++)
                if (str.substring(j, j+1).equals(ab.substring(k, k+1)))
                    count[k]++;


        int unique = 0;
        for (int n: count)
            if (n>0) unique++;

        System.out.printf("There are %d unique letters in the string.", unique);
    }
}
