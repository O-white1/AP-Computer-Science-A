package Q2.Prog214b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));
            int    employeeNumber;
            double yearToYearPay;
            double basePayRate;
            double shiftCode;
            int    hoursWorked;

            while (file.hasNext()) {
                employeeNumber = file.nextInt();
                yearToYearPay  = file.nextDouble();
                basePayRate    = file.nextDouble();
                shiftCode      = file.nextDouble();
                hoursWorked    = file.nextInt();


            }


            //The gross pay is found by multiplying the hours
            //worked by the pay rate where the
            //
            // pay rate is the product of the base pay rate
            // and the shift factor.



            /*
            Employee number: 1002
            Hours: 25.00
            Rate: 3.25
            Shift Factor: 1.00
                      // Current // Year-to date // : 10 spaces
            Gross Pay     81.25    |  3970.00
            Withholding   0.00     |  N/A
            FICA          4.92     |  N/A
            Net Pay       76.33    |  N/A
             */
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
