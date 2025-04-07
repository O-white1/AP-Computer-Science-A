package Q3.Prog295c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class Prog295c {
    public static void main(String[] args){
        try {
        Scanner file1 = new Scanner(new File("Langdat/merge1.dat"));
        Scanner file2 = new Scanner(new File("Langdat/merge2.dat"));
        Stack<Employee> file1Stack = new Stack<>();
        Stack<Employee> file2Stack = new Stack<>();
        Stack<Employee> allPeople  = new Stack<>();

        while (file1.hasNext()) {
            String line = file2.nextLine();

            String SSN = line.substring(0, 10);
            char classification = line.charAt(12);
            char type = line.charAt(14);
            int dptCode = Integer.parseInt(line.substring(15));
            file2Stack.push(new Employee(SSN, classification, type, dptCode));
        }
        while (file2.hasNext()) {
            String line = file2.nextLine();

            String SSN = line.substring(0, 10);
            char classification = line.charAt(12);
            char type = line.charAt(14);
            int dptCode = Integer.parseInt(line.substring(15));
            file2Stack.push(new Employee(SSN, classification, type, dptCode));
        }
        for (int i = 0; i < file1Stack.size(); i++) {
            if (Integer.parseInt(file1Stack.get(i).getSSN()) >= Integer.parseInt(file2Stack.get(i).getSSN())) allPeople.push(file1Stack.get(i));
            else allPeople.push(file2Stack.get(i));
        }

        for (int i = 0; i < allPeople.size()-1; i++) {
            Employee e = allPeople.get(i);
            System.out.println(e.getSSN() + "\t" + e.getClassification() + "\t" + e.getType() + "\t" + e.getDepartmentCode());
        }

        }
            catch(IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
/*
000-00-0001   A      B     1
111-11-1111   C      B     1
123-45-6789   A      F     5
222-22-2227   A      L     9
321-01-2345   A      B     1

 */
