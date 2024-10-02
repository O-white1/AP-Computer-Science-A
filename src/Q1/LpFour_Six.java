package Q1;
import java.util.Scanner;

public class LpFour_Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int RandNum1 = (int)(Math.random() * (9 - 1) + 1);
        int RandNum2 = (int)(Math.random() * (9 - 1) + 1);

        String[] RandOpArray = {"+", "-", "*", "/"};
        String Op = RandOpArray[(int) (Math.random() * (3))];

        String Operation = String.format("%d\t%s\t%d", RandNum1, Op, RandNum2);


    }
}
