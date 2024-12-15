package Q2.Prog214c;

public class Transaction {
    private char    myType;
    private double  myGallons;
    private boolean myWash;

    private double myGallonsCost;
    private double myWashCost;
    private double myTotal;

    public Transaction(char type, double gallons, boolean wash) {
        myType        = type;
        myGallons     = gallons;
        myWash        = wash;
        myTotal       = 0;
        myGallonsCost = 0;
        myWashCost    = 0;
    }

    public void calc() {
        if (myWash)        myWashCost    = 2.00 - (0.20*myGallons);
        if (myGallons>=20) myWashCost    = 0.00;
        if (myWashCost<0) myWashCost = 0;
        if (myType=='P')   myGallonsCost = 1.479*myGallons;
        if (myType=='R')   myGallonsCost = 1.359*myGallons;
        if (myType=='H')   myGallonsCost = 1.429*myGallons;


    }
    public void print() {
        if (myType=='P') System.out.printf("Premium:          %.3f Gallons\n", myGallonsCost);
        if (myType=='R') System.out.printf("Regular:          %.3f Gallons\n", myGallonsCost);
        if (myType=='H') System.out.printf("High Octane:          %.2f Gallons\n", myGallonsCost);

        System.out.printf("Gasoline:\n %.2f\n\n", myGallonsCost);
        System.out.printf("Wash: %b   \n%.2f\n\n", myWash, myWashCost);


    }
}
