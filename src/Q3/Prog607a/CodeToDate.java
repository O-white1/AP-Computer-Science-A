package Q3.Prog607a;

public class CodeToDate extends prog607a_Inheritables {
    String Month;
    int day;
    String Day;
    String Year;

    public CodeToDate(String code) {
        this.myCode = code.toLowerCase();
    }

    public void Calc() {
        // month
        for (int lcv = 0; lcv <= 12; lcv++) {
            if (myCode.substring(0, 0).equals(alph[lcv]))
                Month = months[lcv];
        }
        // day char1
        int lcv2 = 0;
        for (int lcv = 16; lcv <= 26; lcv++) {
            lcv2++;
            if (myCode.substring(1, 1).equals(alph[lcv])) {
                day+= 10*lcv2;
            }
        }
        // day char 2
        lcv2 = 0;
        for (int lcv = 16; lcv <= 26; lcv++) {
            lcv2++;
            if (myCode.substring(2, 2).equals(alph[lcv])) {
                day += lcv2;
            }
        }
        //year
        for (int i = 26; i > 16; i--) {
            if (myCode.substring(3, 3).equals(alph[i])) {
                //TODO
            }
        }



    }

    public String getDate() {return myDate;}
}
