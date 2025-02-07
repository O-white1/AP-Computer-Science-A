package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            while (file.hasNext()) {
                int count = 0;
                int rows = file.nextInt();
                int cols = file.nextInt();
                int[][] mat = new int[rows][cols];

                for (int r = 0; r < mat.length; r++) {
                    for (int c = 0; c < mat[0].length; c++) {
                        mat[r][c] = file.nextInt();
                        System.out.print(mat[r][c] + " ");
                        if (mat[r][c] != 0)
                            count++;
                    }
                    System.out.println();
                }
                System.out.println("\n\n");

                int[][] red = new int[3][count+1];
                for (int r = 0; r < mat.length; r++) {
                    for (int c = 0; c < mat[0].length; c++) {
                        if (mat[r][c] != 0) {
                            red[0][count] = r + 1;
                            red[1][count] = c + 1;
                            red[2][count] = mat[r][c];
                            System.out.println(red[0][count] + " " + red[1][count] + " " + red[2][count]);
                        }
                    }
                }
                System.out.println("\n");
            }



        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
