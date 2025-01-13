package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));
            int[][] mat = new int[5][6]; // 5 rows, 6 cols
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length-1; c++) { // mat[r].length-1
                    mat[r][c] = file.nextInt();
                }
            }
            for (int r = 0; r < mat.length; r++) {
                int rowBig = Integer.MIN_VALUE;
                for (int c = 0; c < mat[r].length-1; c++) {
                    if (mat[r][c] > rowBig) rowBig = mat[r][c];
                }
                mat[r][5] = rowBig;
            }
            for (int[] row : mat) {
                for (int num : row)
                    System.out.print(num + " ");
                System.out.println();
            }
        }



        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
