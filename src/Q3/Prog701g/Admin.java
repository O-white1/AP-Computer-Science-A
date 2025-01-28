package Q3.Prog701g;

public class Admin extends Person {
    private String favWord;

    public Admin(String fn, String ln, String fw) {
        super(fn, ln);
        favWord = fw;
    }
    public String getFavWord() {return favWord;}
}
