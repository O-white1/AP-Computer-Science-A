package Q1;
import java.util.Scanner;

public class Strint6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine().toLowerCase().trim();

        String[] myArray = str.split(" ");
        String[] myArray2 = new String[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            myArray2[i] =  myArray[myArray.length - 1 - i];
        }
        for (String lcv : myArray2) {
            System.out.printf(lcv + " ");
        }
    }
}
