package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int r = 0; r < mat.length-1; r++)
                for (int c = 0; c < mat[0].length - 1; c++)
                    mat[r][c] = file.nextInt();
            int sum = 0;
            for (int lcv = 0; lcv < mat.length; lcv++) {
                sum += mat[lcv][lcv];
            }
            System.out.println("First Diagonal Sum: " + sum);




        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
