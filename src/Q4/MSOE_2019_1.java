package Q4;
import java.util.Scanner;

public class MSOE_2019_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letter 1: "); char letA = sc.next().charAt(0);
        System.out.println("Enter Letter 2: "); char letB = sc.next().charAt(0);
        System.out.println("Enter Text: "); String text = sc.next();
        int cnt = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if ((text.charAt(i) == letA || text.charAt(i)== letB) && (text.charAt(i+1) == letB || text.charAt(i+1)== letA)) {
                cnt++;
            }
        }
        System.out.printf("The letters appear beside each other in the text %d times\n", cnt);
    }
}
