package Q3;

import java.util.Scanner;

public class Prog910a {
    public static String decToBinary(int num) {
        if (num==0) return "0";
        if (num==1) return "1";
        return decToBinary(num/2) + (num%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to convert to binary: ");
        int num = sc.nextInt();
        while (num!=-1) {
            System.out.println(decToBinary(num));
            System.out.print("Enter Number to convert to binary: ");
            num = sc.nextInt();
        }

    }
}
