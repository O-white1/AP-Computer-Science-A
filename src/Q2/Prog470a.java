package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][6];

            for (int r = 0; r < 5; r++)
                for (int c = 0; c < 5; c++)
                    mat[r][c] = file.nextInt();

            for (int r = 0; r < 5; r++)
                for (int c = 0; c < 5; c++)
                    mat[r][5] += mat[r][c]; // sums

            for (int[] row: mat) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }

            System.out.println();
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
