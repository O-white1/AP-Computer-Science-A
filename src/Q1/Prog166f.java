package Q1;

public class Prog166f {
    public static void main(String[] args) {
        int sum = 0;
        for (int lcv = 100; lcv <= 110; lcv++) {
            System.out.printf("the sum of numbers 1 to %d is %d\n", lcv, sum(lcv));
        }
    }
    public static int sum(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) result += i;
        return result;

    }

}
