package Q4;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;




public class AP_P_MSOE_2021 {

    static int waterOz = 0;
    static int waterOzBase = 0;

    public static boolean makeCup(int n) {
        waterOz -= n+1;
        return waterOz > 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter oz of water in reservoir: ");
        waterOzBase = sc.nextInt();
        waterOz     = waterOzBase;
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter cup oz:"); int n = sc.nextInt();
            if (makeCup(n)) continue;
            else {
                System.out.println(i);
                break;
            }
        }

    }
}
