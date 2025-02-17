package Q3.Prog607a;

public class CodeToDate {
    char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String myCode;
    String myDate;

    public CodeToDate(String code) {
        this.myCode = code;
    }

    public void Calc() {
        char monLet = myCode.charAt(0);
        for (int i = 0; i < alph.length; i++) {
            if (alph[i] == monLet) {}
        }
    }

    public String getDate() {return myDate;}
}
