package Q4.Prog7000l;
import java.util.*;
import java.io.*;

public class prog7000l {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog7000l.csv"));
            var X = new ArrayList<Double[]>();
            var y = new ArrayList<Double>();
            file.nextLine(); // ignore header
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] data = line.split(",");
                Double[] row = {
                        Double.parseDouble(data[2]),
                        Double.parseDouble(data[0]),
                };
                y.add(Double.parseDouble(data[1]));
                X.add(row);
            }
            var X_train = new double[X.size()][2];
            for (int i = 0; i < X.size(); i++) {
                X_train[i][0] = X.get(i)[0];
                X_train[i][1] = X.get(i)[1];
            }
            var y_train = new double[y.size()];
            for (int i = 0; i < y.size(); i++) {
                y_train[i] = y.get(i);
            }

            var lr = new LinearRegression(60, 100, 0.0000001, 0.00001);
            lr.fit(X_train, y_train, 100);
            System.out.println(lr);

            double sqFoot = 1897;
            double closestPoint = X_train[0][0];
            int closestIndex = 0;
            for (int i = 1; i < X_train.length; i++) {
                if (Math.abs(X_train[i][0] - sqFoot) < Math.abs(closestPoint - sqFoot))
                    closestPoint = X_train[i][0];
                closestIndex = i;
            }
            System.out.println("Predicted price for house: " + lr.predict(sqFoot));
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
