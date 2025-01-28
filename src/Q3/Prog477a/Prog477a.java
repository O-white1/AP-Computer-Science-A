package Q3.Prog477a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            while (file.hasNext()) {

            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
