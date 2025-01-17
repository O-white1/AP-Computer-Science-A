package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];

            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 4; c++) {
                    mat[r][c] = file.nextInt();
                    System.out.print(mat[r][c] + "\t\t");
                }
            System.out.println();
            }
            System.out.println("Row:\tColumn:");
            for (int r = 0; r < 3; r++)
                for (int c = 0; c < 4; c++)
                    if (mat[r][c] < 100) System.out.printf("%d\t\t\t%d\n", r + 1, c + 1);
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
