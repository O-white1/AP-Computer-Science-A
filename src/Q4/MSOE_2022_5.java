package Q4;
import java.util.Scanner;
public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight of Shell 1: "); int weight1 = sc.nextInt();
        System.out.println("Enter Weight of Shell 2: "); int weight2 = sc.nextInt();
        System.out.println("Enter Weight of Shell 3: "); int weight3 = sc.nextInt();
        System.out.println("The minimum number of buckets is "+ (int)Math.ceil((weight1 + weight2 + weight3)/100.0));
    }
}
