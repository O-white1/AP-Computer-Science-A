package Q3.Prog607a;

import java.util.Scanner;

public class prog607a {
    Scanner sc = new Scanner(System.in);
    public void choiceLoop() {
        System.out.println("---menu---\n0. Exit\n1. Encode Data: \n2. Decode Data: \n");
        int choice = sc.nextInt();
        switch (choice) {
            case 0: {
                return;
            }

            case 1: {
                System.out.print("Enter Date: ");
                String date = sc.next();

                DateToCode obj = new DateToCode(date);
            }

            case 2: {
                System.out.println("Enter Code: ");
                String code = sc.next();

                CodeToDate obj = new CodeToDate(code);
            }
        }
    }

    public static void main(String[] args) {

    }
}
