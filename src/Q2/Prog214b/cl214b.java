package Q2.Prog214b;

public class cl214b {
    private int    myEmployeeNumber;
    private double myYearToDatePay;
    private double myBasePayRate;
    private double myShiftCode;
    private double myHoursWorked;
    private double GrossPay;
    double TaxRate;
    double withholding;
    double netPay;
    double Taxiboy;

    public cl214b(int en, double ytyp, double bpr, double sc, double hw) {
        myEmployeeNumber = en;
        myYearToDatePay  = ytyp;
        myBasePayRate    = bpr;
        myShiftCode      = sc;
        myHoursWorked    = hw;
    }

    public void calc() {
        myBasePayRate  *= myShiftCode; // trust it, it's right
        GrossPay   = myBasePayRate*myHoursWorked;
        TaxRate = 0; // fica
        //Actual Tax Rate
        //  |
        //  V
        if (GrossPay<100.00) Taxiboy = 0;
        else if (GrossPay>100.00&&GrossPay<=149.00) Taxiboy = 0.08;
        else if (GrossPay>150.00&&GrossPay<=199.00) Taxiboy = 0.12;
        else if (GrossPay>200.00&&GrossPay<=299.00) Taxiboy = 0.15;
        else if (GrossPay>300.00) Taxiboy = 0.175;


        if (myYearToDatePay<=17_300) {
            TaxRate = 0.0605;
            if (myYearToDatePay+GrossPay>17_300) {
                TaxRate = 0.0605*(17_300-myYearToDatePay);
            }
        }
        netPay = GrossPay - withholding;

        withholding = (GrossPay*Taxiboy);
    }

    public int    getEmployeeNumber(){ return myEmployeeNumber; }
    public double getYearToYearPay() { return myYearToDatePay; }
    public double getBasePayRate()   { return myBasePayRate; }
    public double getShiftCode()     { return myShiftCode; }
    public double getHoursWorked()   { return myHoursWorked; }
    public double getGrossPay()      {return GrossPay;}
    public double getNetPay()        {return netPay;}
    public double getWithholding()   {return withholding;}
    public double getTaxRate()       {return TaxRate;}
}
