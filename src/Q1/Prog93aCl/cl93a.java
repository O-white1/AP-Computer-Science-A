package Q1.Prog93aCl;

public class cl93a {
    private int kwh;
    private double BaseRate;
    private double SurCharge;
    private double CityTax;
    private double Total;
    private double LateTotal;




    public cl93a(int kwh) {
        this.kwh = kwh;
        BaseRate = 0.0475;
        SurCharge = 0.0;
        CityTax = 0.0;
        Total = 0.0;
        LateTotal = 0.0;


    }
    public void calc() {
        Total += kwh * BaseRate;

    }
    public String toString() { // implicitly called on print methods
        return "kwh Used: \n"        + kwh
                + " BaseRate: \n"    + BaseRate
                + " SurCharge: \n"   + SurCharge
                + " CityTax: \n"     + CityTax
                + " Total: \n"       + Total
                + " LateTotal: \n"   + LateTotal;
    }
}
