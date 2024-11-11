package Q2.Prog435g;

public class cl435g {
    private int myScore;
    private int myRank;

    public cl435g(int score) {
        myScore = score;
        myRank = 0;
    }

    public void SetRank(int rank) {myRank = rank;}
    public String toString()      { return myScore + "\t\t" + myRank;}

}
