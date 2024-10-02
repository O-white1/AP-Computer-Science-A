package Q1;
import java.util.Scanner;

public class Strint6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase().trim();

        boolean CharIsNew = true;
        int UniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    UniqueCount++;
                }
            }
        }
        System.out.println(UniqueCount);
    }
}
