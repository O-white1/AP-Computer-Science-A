package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464d {
    /**
     * Performs Matrix Transposition on a 2D array of integers.
     * @param mat The 2D array to be transposed
     * @return    The transposition of <pre>mat</pre>
     */
    public static int[][] transpose(int[][] mat) {
        int[][] temp = new int[mat[0].length][mat.length]; // opposite aka Transposed
        for (int r = 0; r < 5; r++)
            for (int c = 0; c < 5; c++)
                temp[r][c] = mat[c][r]; // transposed[col][row] = mat[row][col]

        return temp;
    }


    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int r = 0; r < 5; r++) // row major order
                for (int c = 0; c < 5; c++)
                    mat[r][c] = file.nextInt();

            int[][] mat_T = transpose(mat);
            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }
            System.out.println("Transposed Matrix: ");

            for (int r =0; r < 5; r++) {
                for (int c = 0; c < 5; c++)
                    System.out.print(mat_T[r][c] + " ");

                System.out.println();
            }



        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
