package Q1;
import java.util.Scanner;

public class lpFour_two {
    public static void main(String[] args) {
        String text = "";
        boolean TooHeavy = false;
        boolean TooBig = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter package weight: ");     int weight = sc.nextInt();
        System.out.println("Enter package height (cm): ");int height = sc.nextInt();
        System.out.println("Enter package length (cm): ");int length = sc.nextInt();
        System.out.println("Enter package width (cm): "); int width = sc.nextInt();

        int vol = length * width * height;
        if (weight >= 27) {
            text = "Package is too heavy";
            TooHeavy = true;
        }
        if (vol >= 100000) {
            text = "Package is too big";
            TooBig = true;
        }
        if (TooHeavy && TooBig) text = "Package is too heavy and too big!";
        if (!TooHeavy && !TooBig) text = "Package is goo to ship";

        System.out.println(text);


    }
}
