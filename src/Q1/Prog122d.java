package Q1;


public class Prog122d {
    public static void main(String[] args) {
        for (int x = -12; x < 16; x++) {
            long y = yFunc(x);
            System.out.println(x + "   " + y);;
        }
    }

    public static long yFunc(int x) {
        long y = ( (long)Math.pow(x, 6)
                - (3 * ((long)Math.pow(x, 5))
                - (93 * ((long)Math.pow(x, 4)))
                + (87 * ((long)Math.pow(x, 3)))
                + (1596 * ((long)Math.pow(x, 2)))
                - ((long)1380*x) - 2800) );

        return y;
    }
}
