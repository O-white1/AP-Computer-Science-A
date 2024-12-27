package Q2.Prog214b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));
            ArrayList<cl214b> list = new ArrayList<>();

            while (file.hasNext()) {
                cl214b worker = new cl214b(file.nextInt(), file.nextDouble(), file.nextDouble(), file.nextDouble(), file.nextDouble());
                worker.calc();
                list.add(worker);
            }
            for (cl214b me : list) {
                System.out.println();
                System.out.println("Employee Number: " + me.getEmployeeNumber());
                System.out.println("Hours Worked:    " + me.getHoursWorked());
                System.out.println("Base Pay Rate:   " + me.getBasePayRate());
                System.out.println("Shift Code:      " + me.getShiftCode());
                System.out.printf("Gross Pay:       %.2f(Current)\t%.2f(YearToDate)\n", me.getGrossPay(), me.getYearToYearPay());
                System.out.printf("Withholding:     %.2f\n", me.getWithholding());
                System.out.printf("FICA:            %.2f\n", me.getGrossPay()* me.getTaxRate());
                System.out.println("NetPay:          " + me.getNetPay());
                System.out.println("_________________________________________");
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
