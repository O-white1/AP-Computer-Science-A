package Q3.Prog295c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog295c {
    public static void main(String[] args){
        try {
        Scanner file = new Scanner(new File("C:\\Users\\white.o3\\Documents\\GitHub\\AP-Comp-Sci-A\\Langdat\\merge1.dat"));
        ArrayList<Employee> people = new ArrayList<>();

        while (file.hasNext()) {
            String line = file.nextLine();

            String SSN = line.substring(0, 13);
            char classification = line.charAt(15);
            char type = line.charAt(16);
            int dptCode = Integer.parseInt(line.substring(17));
            people.add(new Employee(SSN, classification, type, dptCode));
        }

        }
            catch(IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
