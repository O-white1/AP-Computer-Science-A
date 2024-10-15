import java.io.IOException;
import java.io.File;
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
