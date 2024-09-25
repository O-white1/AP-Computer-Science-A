package Q1;

public class Prog122h {
    public static void main(String[] args) {
        int num, sqr, cube;
        double sqrt, frthroot;

        for (int lcv = 0; lcv <= 20; lcv++) {
            num = lcv;
            sqr = num * num;
            cube = (int)Math.pow(num, 3.0);
            sqrt = Math.sqrt(num);
            frthroot = Math.pow(num, 1.0 /4);
            System.out.printf("%d\t\t%d\t\t%f\t\t%d\t\t%f\n", num, sqr, sqrt, cube, frthroot);

        }
    }
}
