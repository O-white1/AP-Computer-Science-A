package Q2.Prog435g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog435g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog435g.dat"));
            int[] scores = new int[100];
            int count = 0;

            while (file.hasNext()) {
                int score = file.nextInt();
                scores[count] = score;
                count++;
                // scores[count++] = file.nextInt();
            }

            // sort scores with bubble sort algorithm
            for (int j = 0; j < count; j++) {
                for (int k = 0; k < count - 1; k++) {
                    if (scores[k] > scores[k + 1]) {
                        int temp = scores[k];
                        scores[k] = scores[k + 1];
                        scores[k + 1] = temp;
                    }
                }
            }

            cl435g[] golfers = new cl435g[count];
            for (int i = 0; i < count; i++) {
                cl435g cooldude = new cl435g(scores[i]);
                golfers[i] = cooldude;
            }

            int rank = 1;
            for (int i = 0; i < count; i++) {
                golfers[i].SetRank(rank);
                if (i < count-1 && scores[i] != scores[i+1]) rank++;
            }

            System.out.println("Scores\tRank");
            for (int i = 0; i < count; i++) {
                System.out.println(golfers[i].toString());
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
