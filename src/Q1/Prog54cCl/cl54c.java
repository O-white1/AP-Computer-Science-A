package Q1.Prog54cCl;

public class cl54c {
    private double rad;
    private double PI = 3.14;
    private double Circ;
    private double Area;

    public cl54c(double radius) {
        rad = radius;
        Area = 0;
        Circ = 0;
    }
    public void Calc() {
        Area = PI*(rad*rad);
        Circ = 2 * (PI*rad);
    }
    public double GetCirc() {return Circ;}
    public double GetArea() {return Area;}
}
