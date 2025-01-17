package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));
            int[][] mat  = new int[file.nextInt()][file.nextInt()];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = file.nextInt();
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }

        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
