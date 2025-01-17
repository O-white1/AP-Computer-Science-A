package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));
            int rows = file.nextInt();
            int cols = file.nextInt();
            int[][] mat  = new int[rows][cols];

            System.out.println("Original File: ");

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = file.nextInt();
                    System.out.println(mat[i][j]);
                }
            }

            System.out.println();
            System.out.println("Matrix: ");
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[row].length; col++)
                    System.out.print(mat[row][col] + " ");
                System.out.println();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
