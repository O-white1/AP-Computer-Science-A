package Q4;
import java.util.Scanner;
public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int lcv=0;lcv<3;lcv++) {
            System.out.printf("Enter Weight of Shell %d: \n", lcv+1); sum+= sc.nextInt();
        }
        System.out.println("The minimum number of buckets is "+ (int)Math.ceil((sum)/100.0));
    }
}
