package Q2.LPThree_Ten;

public class clLp3_10 {
    private int Burgers;
    private int Fries;
    private int Sodas;

    public clLp3_10(int b, int f, int s) {
        Burgers = b;
        Fries = f;
        Sodas = s;
    }

    public void calc() {
        Burgers *= 1.69;
        Fries   *= 1.09;
        Sodas   *= 0.99;
    }
    public double getBurg() {
        return Burgers;
    }
    public double getFri() {
        return Fries;
    }
    public double getSoda() {
        return Sodas;
    }
    public double getTotal() {
        return Burgers + Fries + Sodas;
    }
}
