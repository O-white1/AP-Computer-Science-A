package Q4.Prog7000l;

public class LRTest {
    public static void main(String[] args) {
        double[][] X_train = {
                {2.49, 1},
                {2.57, 1},
                {3.14, 1},
                {1.25, 1},
                {1.84, 1},
                {3.86, 1},
                {9.37, 1},
                {6.58, 1},
                {8.18, 1},
        };
        double[] y_train = {147.38, 130.23, 150.78, 99.58, 207.89, 1770.5, 200.0, 180.77, 135.7};

        var lr = new LinearRegression(5, 100, 0.01, 0.001);
        lr.fit(X_train, y_train, 1000);
        System.out.println(lr);
        double new_X = 6.85;
        System.out.println("Predicted output for " + new_X + ":" + lr.predict(new_X));

    }
}
