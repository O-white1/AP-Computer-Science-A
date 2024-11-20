package Q2.LPThree_Nine;

public class clLp3_9 {
    private int myYear;
    private int myMonth;
    private int myDay;

    private int myThisYear;
    private int myThisMonth;
    private int myThisDay;

    private int mySleepHours;

    public clLp3_9(int y, int m, int d, int ty, int tm, int td) {
        myYear       = y;
        myMonth      = m;
        myDay        = d;
        myThisYear   = ty;
        myThisMonth  = tm;
        myThisDay    = td;
        mySleepHours = tm;
    }

    public void calc() {
        int totalDays = (myYear*365)+(myMonth*30)+(myDay);
        mySleepHours = totalDays*8;
    }
    public int getYear()   { return myThisYear-myYear; }
    public int getMonth()  { return myThisMonth-myMonth; }
    public int getDays()   { return Math.abs(myThisDay-myDay); }
    public int getSleeps() { return mySleepHours; }
}
