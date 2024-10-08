package Q1.Prog54bCl;

public class cl54b {
    private int num1;
    private int num2;

    private int sum;
    private int avg;

    public cl54b(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        sum = 0;
        avg = 0;
    }

    public void Calc() {
        sum = num1 + num2;
        avg = sum / 2;
    }
    public int GetAvg() {return avg;}
    public int GetSum() {return sum;}
}
