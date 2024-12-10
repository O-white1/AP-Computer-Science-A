package Q2.Prog602b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog602b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("langdat/prog602b.dat"));
            ArrayList<InternetCostomer> list = new ArrayList<InternetCostomer>();
            while (file.hasNext()) {
                int id       = file.nextInt();
                double hours = file.nextDouble();
                int code     = file.nextInt();

                InternetCostomer fred = new InternetCostomer(id, hours, code);
                list.add(fred);

            }
            for (int lcv = 0; lcv < list.size(); lcv++) {
                InternetCostomer me = list.get(lcv);
                me.setCharge();
            }
            System.out.println("Account #\t\tHours\t\tCode\t\tAmount Due");
            for (InternetCostomer me : list) {
                System.out.printf("%d\t%.2f\t\t%d\t\t\t$%.2f\n", me.getAcc(), me.getHours(), me.getCode(), me.getCharge());
            }

        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
