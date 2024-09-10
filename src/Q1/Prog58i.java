package Q1;
import java.util.*;

public class Prog58i {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("The amount I wish to borrow is$");
        double p = in.nextDouble(); // principal

        System.out.print("The loan rate is ");;
        double r = in.nextDouble(); // rate

        System.out.print("The number of months to pay off the loan in ");
        double m = in.nextDouble(); // months

        double r_over_1200 = r/1200;
        double mp = p * (r_over_1200 * (Math.pow(1+r_over_1200, m))
                                     / (Math.pow(1+r_over_1200, m)-1));


        System.out.printf("My Monthly payments will be $%.2f\n", mp);
        System.out.printf("The total interest paid is $%.2f\n", mp * m);
        System.out.printf("The total amount paid is $%.2f", (mp * m) + p);

    }
}
