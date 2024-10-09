package Q1;
import java.util.Scanner;

public class lpFour_Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guess number (1-20): ");
        int guess = sc.nextInt();

        int compGuess = (int)(Math.random()*20);
        int num = (int)(Math.random()*20);

        if (guess == num) {
            System.out.println("You won! The number is " + num);
            System.out.println("Computer Guessed: " + compGuess);

        }
        else {
            System.out.println("You lost! The number is " + num);
            System.out.println("Computer Guessed: " + compGuess);
        }




    }
}
