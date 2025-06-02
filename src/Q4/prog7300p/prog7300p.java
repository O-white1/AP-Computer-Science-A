package Q4.prog7300p;
import java.util.Arrays;

public class prog7300p {
    public static void main(String[] args) {
        //AND Neuron
        double[][] X_train = {
                {0,0},
                {0,1},
                {1,0},
                {1,1}
        };
        double[] y_train = {0, 0, 0, 1};
        System.out.println("AND Neuron: ");
        var model = new Perceptron();
        model.fit(X_train, y_train, 15, 0.1);

        double[] y_pred = model.predict(X_train);
        System.out.println("predicted: " + Arrays.toString(y_pred));
        System.out.println("Actual: "    + Arrays.toString(y_train));
        System.out.println("weights: "   + Arrays.toString(model.getWeights()));
        System.out.println("bias: "      + model.getBias());
        // OR
        double[][] X_trainOR = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        double[] y_trainOR = {0, 1, 1, 1};

        model.fit(X_trainOR, y_trainOR, 20, 0.1);
        double[] y_predOR = model.predict(X_trainOR);
        System.out.println("predicted: " + Arrays.toString(y_predOR));
        System.out.println("Actual: "    + Arrays.toString(y_trainOR));
        System.out.println("weights: "   + Arrays.toString(model.getWeights()));
        System.out.println("bias: "      + model.getBias());

    }
}
