package Q2.Prog215i;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dfile {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("LANGDAT/FILENAME"));
            while (file.hasNext()) {

            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}