package Q4.Prog7000l;

import java.util.Arrays;

public class LinearRegression {
    private double theta0;          // y intercept
    private double theta1;         // slope
    private double alpha;         // learning rate
    private double tolerance;    // cost threshold (convergence)
    private double[] objective; // cost per epoch

    public LinearRegression(double thetaOne, double thetaZero, double learningRate, double tol) {
        theta0    = thetaOne;
        theta1    = thetaOne;
        alpha     = learningRate;
        tolerance = tol;

    }

    public void fit(double[][] X_train, double[] Y_train, int epochs) {
        int m = X_train.length;
        objective = new double[epochs];
        double[] e = new double[m];
        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0, temp1 = 0;
                // RHS of Gradient Decent
                for (int i = 0; i < m; i++) {
                    //predicted - actual
                    double temp = (theta0 * X_train[i][0] + theta0) - Y_train[i];
                    temp0+= temp;
                    temp1 += temp * X_train[i][0];
                }
                //LHS of Graident Decent
                theta0 -= (1.0/m) * alpha * temp0;
                theta1 -= (1.0/m) * alpha * temp1;
            }
            for (int i = 0; i < m; i++) {
                e[i] = (theta1 * X_train[i][0] + theta0) - Y_train[i]; // J(TH0, TH1)
            }
            double obj = 0; // calculate MSE (mean squared error)
            for (int i = 0; i < m; i++) {

                obj += e[i] * e[i];
                objective[epoch] = obj;
            }
            if (epoch > 1 && Math.abs(objective[epoch]-objective[epoch-1]) < tolerance ) {
                break;
            }
        }
    }

    public double predict(double x) {return theta1*x + theta0;}
    public double getIntercept()    {return theta0;}
    public double getSlope()        {return theta1;}

    @Override
    public String toString() {
        return "Regression Line: y = " + theta1 + " * x + " + theta0 +
                " \nObjective: " + Arrays.toString(objective) +
                "\nMin. Objective: " + Arrays.stream(objective).min().getAsDouble();
    }

}
