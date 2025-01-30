package Q3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));
            List<Person> list = new ArrayList<>();

                int    num = file.nextInt();
                while (num != 99) {
                    String f = file.next();
                    String l = file.next();

                    if (num==1) {
                        double gpa = file.nextDouble();
                        Person p = new Student(f,l,gpa);
                        list.add(p);
                    }
                    else if (num==2) {
                        int ns = file.nextInt();
                        Person p = new Teacher(f,l, ns);
                        list.add(p);
                    }
                    else if (num==3) {
                        String fw = file.nextLine();
                        Person p = new Admin(f, l, fw);
                        list.add(p);
                    }
                    num = file.nextInt();
                }

                double  tot = 0;
                int cnt = 0;
                int totStus = 0;

                String large = "";
                String small = "################################################################";
                for (Person p : list) {
                    if (p instanceof Student) {
                        tot += ((Student) p).getGPA();
                        cnt++;
                    }
                    else if (p instanceof Teacher) {
                        totStus += ((Teacher) p).getMyNumStus();
                    }
                    else if (p instanceof Admin) {
                        String word = ((Admin) p).getFavWord();
                        if (word.length() > large.length())
                            large = word;
                        if (word.length()<small.length())
                            small = word;
                    }
                }


                System.out.printf("Average Student GPA: %.2f\n", tot/cnt);
                System.out.println("Total number of students: " + totStus);
                System.out.println("Smallest fav admin word: " + small);
                System.out.println("Largest fav admin word: " + large);

        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }

}
