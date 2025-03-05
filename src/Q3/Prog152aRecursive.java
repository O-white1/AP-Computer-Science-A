package Q3;

public class Prog152aRecursive {
    static int out = 0;
     static int sumStep3(int n) {
        if (n==9669) return out;
        out+=n;
        return sumStep3(n+3);
    }

    public static void main(String[] args) {
        System.out.println(sumStep3(0));
    }
}
