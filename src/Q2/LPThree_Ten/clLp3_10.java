package Q2.LPThree_Ten;

public class clLp3_10 {
    private int Burgers;
    private int Fries;
    private int Sodas;
    double      BurgersCost = 0;
    double      FriesCost   = 0;
    double      SodasCost   = 0;

    public clLp3_10(int b, int f, int s) {
        Burgers = b;
        Fries = f;
        Sodas = s;
        BurgersCost = b;
        FriesCost   = f;
        SodasCost   = s;
    }
    public void calc() {
        BurgersCost *= 1.69;
        FriesCost   *= 1.09;
        SodasCost   *= 0.99;
    }
    public double  getBurg()  {return BurgersCost;}
    public double   getFri()   {return FriesCost;  }
    public double  getSoda()  {return SodasCost;  }
    public double getTotal() {return BurgersCost + FriesCost + SodasCost;}
}
