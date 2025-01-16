package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/Prog465b.dat"));
            int[][] mat = new int[3][4];
            for (int r = 0; r < 3; r++)
                for (int c = 0; c < 4; c++)
                    mat[r][c] = file.nextInt();


        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
