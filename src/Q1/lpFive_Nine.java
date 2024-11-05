package Q1;

public class lpFive_Nine {
    public static void main(String[] args) {
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= 5; y++)
                System.out.printf("%4d\t", (int) Math.pow(x, y));
            System.out.print("\n");
        }
    }
}
