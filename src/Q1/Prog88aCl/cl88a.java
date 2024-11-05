package Q1.Prog88aCl;

public class cl88a {
    private final int n1;
    private final int n2;
    private int sum, dif, prod, dist, max, min;
    private double avg;

    public cl88a(int num1, int num2) {
        n1 = num1;
        n2 = num2;
        sum = 0;
        dif = 0;
        prod = 0;
        dist = 0;
        max = 0;
        min = 0;
    }
    public void Calc() {
        sum = n1 + n2;
        dif = n1 - n2;
        prod = n1 * n2;
        dist = Math.abs(n2 - n1);
        avg = ((double)n1 + n2) / 2;
        if (n2 > n1) {max = n2; min = n1;}
        else         {max = n1; min = n2;}
    }
    public int  GetSum() {return sum; }
    public int  GetDif() {return dif; }
    public int GetProd() {return prod;}
    public int GetDist() {return dist;}
    public int  GetMax() {return max; }
    public int  GetMin() {return min; }
    public double GetAvg() {return avg; }


}
