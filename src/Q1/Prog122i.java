package Q1;

public class Prog122i {
    public static void main(String[] args) {
        for (int lcv = 25; lcv >= 0; lcv--) {

            int cube = (int)Math.pow(lcv, 3);
            double cubeRoot = Math.pow(lcv, 1.0/3);

            System.out.printf("-%d\t\t-%f\t\t-%d\n", lcv, cubeRoot, cube);

        }
        for (int lcv = 0; lcv <= 25; lcv++) {

            int cube = (int)Math.pow(lcv, 3);
            double cubeRoot = Math.pow(lcv, 1.0/3);

            System.out.printf("%d\t\t%f\t\t%d\n", lcv, cubeRoot, cube);

        }
    }
}
