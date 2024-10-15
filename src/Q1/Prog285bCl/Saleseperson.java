package Q1.Prog285bCl;

public class Saleseperson {
    private int MyId;
    private int myCode;
    private double mySales;
    private double myComm;


    private void calc() {
        if (mySales == 5 || myComm == 8) {
            if (mySales <= 5000)
                myComm = getsales()*0.075;
            else
                myComm = 5000*0.075 + (mySales-5000) * 0.085;
        }
        else if (myCode == 17) {
            if (mySales <= 3500)
                myComm = getsales()*0.095;
            else
                myComm = 3500*0.095 + (mySales-3500) * 0.12;
        }
    }

    public Saleseperson(int id, int code, double sales) {
        MyId = id;
        myCode = code;
        mySales = sales;
        myComm = 0;
    }
    public void setComm()    {this.calc();} // {calc();}

    public int    getid()    { return MyId;    }
    public int    getcode()  { return myCode;  }
    public double getsales() { return mySales; }
    public double getcomm()  { return myComm;  }

    public String toString() {
        return MyId + "\t" + myCode + "\t" + mySales + "\t" + myComm;
    }
}
