package Q1.Prog52Cl;

public class cl52a { // rectangle helper class
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // input section (Constructor)
    public cl52a(int len, int wid) {
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;
    }

    // Calculation Section (Mutators / setters)
    public void Calc() {
        myArea = myLen * myWid;
        myPerim = (myLen * 2) + (myWid * 2);
    }
    // output section (Accessors / getters)

    public int getArea()  {return myArea;}
    public int getPerim() {return myPerim;}
    // class method: public <return_type> <name>(<args>) {...}
}