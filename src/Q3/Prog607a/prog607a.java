package Q3.Prog607a;

import java.util.Scanner;

public class prog607a {
    Scanner sc = new Scanner(System.in);
    public void choiceLoop() {
        System.out.println("---menu---\n0. Exit\n1. Encode Date: \n2. Decode Date: \n");
        String choice = sc.next();


    }

    public static void main(String[] args) {

    }
}
/*
Dairy Company encodes the months as the letters 'A'
through 'L', each digit of the day's date as the letters 'Q' through 'Z' and
the year as the letters 'Z" through 'A' plus 1970, where 'Z' represents 1,
and 'A' is 26. Days that would otherwise have only one digit are preceded
by a zero.
 */