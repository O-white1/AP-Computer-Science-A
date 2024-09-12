package Q1;

public class Prog88a {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * (13 -1)) + 1; // rand: 1 -13
        int num2 = (int) (Math.random() * (20 - 2)) + 2; // rand 2- 20

        int sum = num1 + num2;
        int dif = num1 - num2;
        int prod = num1*num2;
        int abs = Math.abs(dif);
        int max, min;
        double avg = ((double)num1 + num2) / 2;

        if (num1 > num2) {
            max = num1;
        }
        else {
            max = num2;
        }

        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Nums: " + num1 + "and " + num2);

        System.out.println("Max: " +max);
        System.out.println("Min: " +min);

    }
}
