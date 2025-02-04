package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            while (file.hasNext()) {
                int rows = file.nextInt();
                int cols = file.nextInt();
                int[][] mat = new int[rows+1][cols+1];
                int[][] reducedMat = new int[cols][3];

                for (int i = 0; i < mat.length; i++)
                    for (int j = 0; j < mat[i].length-1; j++)
                        mat[i][j] = file.nextInt();

                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        if (mat[i][j] != 0) {
                            reducedMat[j][2] = mat[i][j];
                            reducedMat[j][0] = j;
                            reducedMat[j][1] = i;
                        }
                    }
                }
                for (int[] arr : mat) {
                    for (int lcv : arr) {
                        System.out.print(lcv + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\n\n");


                for (int[] redArr : reducedMat) {
                    for (int lcv : redArr) {
                        System.out.print(lcv + "\t");
                    }
                    System.out.println();
                }
                System.out.println("\n\n");
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
