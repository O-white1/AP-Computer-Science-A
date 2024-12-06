package Q2.LP3_14;

public class clLp3_14 {
    int MyNYVotesA;
    int MyNYVotesM;
    int MyNJVotesA;
    int MyNJVotesM;
    int MyCTVotesA;
    int MyCTVotesM;

    int TotalVotesA;
    int TotalVotesM;
    int TotalVotes;

    double PercentageA;
    double PercentageM;

    public clLp3_14(int nya, int nym, int nja, int njm, int cta, int ctm) {
        MyNYVotesA = nya;
        MyNYVotesM = nym;
        MyNJVotesA = nja;
        MyNJVotesM = njm;
        MyCTVotesA = cta;
        MyCTVotesM = ctm;
    }
    public void calc() {
        TotalVotesA = MyNYVotesA + MyCTVotesA + MyCTVotesA;
        TotalVotesM = MyNYVotesM + MyNJVotesM + MyCTVotesM;
        TotalVotes  = TotalVotesA+ TotalVotesM;
        PercentageA = (double)TotalVotesA / TotalVotes;
        PercentageM = (double)TotalVotesM / TotalVotes;
    }

    public int getTotalA() {return TotalVotesA;}
    public int getTotalM() {return TotalVotesM;}
    public int getTotal()  {return TotalVotes;}
    public double getPercentageA() {return PercentageA;}
    public double getPercentageM() {return PercentageM;}
}
