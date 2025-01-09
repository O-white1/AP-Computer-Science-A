package Q2.Prog215i;

public class cl215i {
    private int   myVCode;
    private double myMiles;
    private double myGallons;
    private double myMPG;


    public cl215i(int v, double m, double g) {
        myVCode   = v;
        myMiles   = m;
        myGallons = g;
        myMPG     = 0;
    }

    public void calc() {
        myMPG = myMiles / myGallons;
    }


    public int    getCode()    {return myVCode;}
    public double getMiles()   {return myMiles;}
    public double getGallons() {return myGallons;}
    public double getMPG()     {return myMPG;}

}
