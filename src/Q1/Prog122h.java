package Q1;

public class Prog122h {
    public static void main(String[] args) {
        int num, sqr, cube;
        double sqrt, frthroot;

        for (int lcv = 0; lcv <= 20; lcv++) {
            num = lcv;
            sqr = num * num;
            cube = (int)Math.pow(num, 3.0);
            System.out.println("%d\t%d\t%f\t%d\t%f", num, sqr, sqrt, cube, frthroot);
        }
    }
}
