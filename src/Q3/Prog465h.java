package Q3;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            while (file.hasNext()) {
                int rows = file.nextInt();
                int cols = file.nextInt();
                int[][] mat = new int[rows][cols];
                int[][] red = new int[3][cols];

                for (int i = 1; i <= rows; i++)
                    for (int j = 1; j <= cols; j++)
                        mat[i][j] = file.nextInt();

                for (int r = 0; r <= rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        if (mat[r][c] != 0) {
                            //TODO: populate reduced matrix
                        }
                    }
                    System.out.println();
                }
                System.out.println("\n");
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
