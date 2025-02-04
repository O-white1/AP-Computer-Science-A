package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            while (file.hasNext()) {
                int[][] mat = new int[file.nextInt()][file.nextInt()];
                int[][] reducedMat = new int[mat[0].length][3];
                int a = 0;

                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        mat[i][j] = file.nextInt();
                    }

                    }


                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        if (mat[i][j] != 0) {
                            reducedMat[2][j] = mat[i][j];
                            reducedMat[0][j] = j;
                            reducedMat[1][i] = i;
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
                for (int[] redarr : reducedMat) {
                    for (int lcv : redarr) {
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
