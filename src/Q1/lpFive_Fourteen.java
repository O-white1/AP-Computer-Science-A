import java.util.Random;

public class lpFive_Fourteen {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int lcv=0; lcv<=5; lcv++){
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            System.out.printf("Rolls: %d and %d, Total: %d%n", die1, die2, die1 + die2);
        }
    }
}
