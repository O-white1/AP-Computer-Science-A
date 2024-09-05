package Q1;
import java.util.*;
import java.lang.Math;

public class MathTest {
    public static void main(String[] args) {
        int twocubed = (int)Math.pow(2, 3); // 2 ^ 3
        int num1 = 5, num2 = 6, num3 = 7;
        int sum = num1+num2+num3;
        double avg = sum /= 3;

        num1 = num1 + 1;
        num1 += 1;
        num1++;

        // +, -, *, /
        // =, +=, -=, *=, /=, %=, ++, --

        int test = 3/4; // = 0, float is ignored in integer, 3/4.0 or 3/(double)4 will work if the variable is saved as a a double

        final double PI = 3.14159; // CAPS for convention on constants.  const = final

        double myWallet = 736537.465;
        double myWalletRounded = Math.round(myWallet * 100.0) / 100.0; // :(
        System.out.println(myWalletRounded);
        System.out.printf("myWalletRounded = %.2f", myWallet); // :)
    }
}
