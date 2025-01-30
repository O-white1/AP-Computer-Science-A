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
            int[][] mat = new int[3][5];


            while (file.hasNext()) {
                Student s = new Student(file.nextInt(), file.nextInt());
                list.add(s);
            }
            for (Student s : list) {
                if (s.getSex()==1) {
                    if ((s.getGrade())==1) mat[0][0]++;
                    if ((s.getGrade())==2) mat[1][0]++;
                    if ((s.getGrade())==3) mat[2][0]++;
                    if ((s.getGrade())==4) mat[3][0]++;
                    if ((s.getGrade())==5) mat[4][0]++;
                }
                if (s.getSex()==2) {
                    if ((s.getGrade())==1) mat[0][1]++;
                    if ((s.getGrade())==2) mat[1][1]++;
                    if ((s.getGrade())==3) mat[2][1]++;
                    if ((s.getGrade())==4) mat[3][1]++;
                    if ((s.getGrade())==5) mat[4][1]++;
                }
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[0].length; j++) {
                        System.out.print(mat[i][j] + "\t");
                    }
                    System.out.println();
                }

            }



        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
