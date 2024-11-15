package Q2.Prog214b;

public class cl214b {
    private int    myEmployeeNumber;
    private double myYearToYearPay;
    private double myBasePayRate;
    private double myShiftCode;
    private int    myHoursWorked;

    public cl214b(int en, double ytyp, double bpr, double sc, int hw) {
        myEmployeeNumber = en;
        myYearToYearPay  = ytyp;
        myBasePayRate    = bpr;
        myShiftCode      = sc;
        myHoursWorked    = hw;
    }

    public void Calc() {
        myBasePayRate  = myShiftCode*myHoursWorked;
        int GrossPay   = (int)(myBasePayRate*myHoursWorked);
        int TaxRate = 0;
    }
}
