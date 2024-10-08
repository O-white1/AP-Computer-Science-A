package Q1.Prog76aCl;

public class cl76a {
    private int Num;

    public cl76a(int num) {
        Num = num;
    }
    public void Calc() {
        Num = (Num*9)*12345679;
    }
    public int getNum() {
        return Num;
    }
}
