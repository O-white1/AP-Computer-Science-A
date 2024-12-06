package Q2.LP3_14;
import java.util.Scanner;

public class LP3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Election Results for New York:");
        System.out.print("Awbrey:   "); int NYVotesA = sc.nextInt();
        System.out.print("Martinez: "); int NYVotesM = sc.nextInt();
        System.out.println("Election Results for New York: ");
        System.out.print("Awbreyxxx:   "); int NJVotesA = sc.nextInt();
        System.out.print("Martinez: "); int NJVotesM = sc.nextInt();
        System.out.println("Election Results for New York: ");
        System.out.print("Awbrey:   "); int CTVotesA = sc.nextInt();
        System.out.print("Martinez: "); int CTVotesM = sc.nextInt();

        clLp3_14 thing = new clLp3_14(NYVotesA, NYVotesM, NJVotesA, NJVotesM, CTVotesA, CTVotesM);
        thing.calc();
        int TotalA = thing.getTotalA();
        int TotalM = thing.getTotalM();
        double PercentA = thing.getPercentageA();
        double PercentM = thing.getPercentageM();

        System.out.println("New York Results: ");
        System.out.printf("Awbrey: %d");
    }
}
