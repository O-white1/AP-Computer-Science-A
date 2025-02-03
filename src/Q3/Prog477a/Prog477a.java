package Q3.Prog477a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            ArrayList<Student> list = new ArrayList<>();
            int[][] mat = new int[6][3];

            while (file.hasNext())
                list.add(new Student(file.nextInt(), file.nextInt()));
            for (Student s : list) {
                if (s.getSex()==1)
                    for (int i = 0; i <= 5; i++)
                        if (s.getGrade()==i){
                            mat[i][0]++;
                            mat[i][2]++;
                        }

                if (s.getSex()==2)
                    for (int i = 0; i <= 5; i++)
                        if (s.getGrade()==i){
                            mat[i][1]++;
                            mat[i][2]++;
                        }
            }
            System.out.println("Grade\t\tMale\t\tFemale\t\tTotal");
            for (int i = 0; i < mat.length; i++) {
                switch (i) {
                    //case 1: System.out.print("A\t");   break;
                    case 2: System.out.print("B\t");   break;
                    case 3: System.out.print("C\t");   break;
                    case 4: System.out.print("D\t");   break;
                    case 5: System.out.print("F\t"); break;
                    //default: System.out.print("\t");
                    default: System.out.print("A\t");   break;
                }

                int[] arr = mat[i];
                for (int j : arr) {
                    System.out.print("\t\t" + j + "\t");
                }
                System.out.println();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
