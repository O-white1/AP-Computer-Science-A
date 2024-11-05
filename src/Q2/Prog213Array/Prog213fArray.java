package Q2.Prog213Array;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fArray {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("LangDat/prog213f.dat"));
            cl213f[] list = new cl213f[1000];
            int count = 0;

            while (file.hasNext()) {
                int kwh = file.nextInt();
                if (kwh != -999) {
                    cl213f yikes = new cl213f(kwh);
                    list[count] = yikes;
                    count++;
                }
            }
            for (int lcv = 0; lcv< count; lcv++) {
                list[lcv].calc();
                System.out.println(list[lcv]);
            }
        }

        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
