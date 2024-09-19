package Q1;
public class Prog122a {
    public static void main(String[] args) {
        System.out.println("Num:\tSquare:\tSquare Root");
        for (int lcv = 0; lcv <= 50; lcv++) {
            double sqr = Math.pow(lcv, 2);
            double sqrt = Math.sqrt(lcv);
            System.out.printf("%d\t%.2f\t%.2f\n", lcv, sqr, sqrt);
        }
    }
}
