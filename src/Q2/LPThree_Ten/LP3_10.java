package Q2.LPThree_Ten;
import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Burgers: "); int burgers = sc.nextInt();
        System.out.println("Enter Number of Fries: " );  int fries   = sc.nextInt();
        System.out.println("Enter Number of Sodas: " );  int sodas   = sc.nextInt();

        clLp3_10 goofJuice = new clLp3_10(burgers, fries, sodas);
        goofJuice.calc();

        double Bcost = goofJuice.getBurg();

        double Fcost = goofJuice.getFri();
        double Scost = goofJuice.getSoda();
        double total = goofJuice.getTotal();
        System.out.printf("Total Price Pre-taxes: %f\n", total);
        System.out.printf("Total Price Post-Taxes: %f\n", total*1.065);
    }


}
