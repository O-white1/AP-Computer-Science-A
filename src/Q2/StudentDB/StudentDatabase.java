package Q2.StudentDB;

import java.util.*;

public class StudentDatabase {
    public static int indexOfStu(ArrayList<Student> db, int id) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId() == id) return i;
        }
        return -1; // not found
    }
    public static int indexOfStu(ArrayList<Student> db, String last) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getLastName().equals(last)) return i;
        }
        return -1; // not found
    }

    public static void printStu(Student s) {
        System.out.printf("%s\t%s\t%d\t%.2f\n", s.getFirstName(), s.getLastName(), s.getId(), s.getGPA());
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Menu: ");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student’s gpa");
            System.out.println("6 - Remove student (by id)");
            System.out.println("7 - Exit");
            System.out.print("Please enter your choice: ");
            int c = input.nextInt();
            if (c==1) {
                System.out.print("Enter First Name: ");String f   = input.next();
                System.out.print("Enter Last Name: "); String l   = input.next();
                System.out.print("Enter Student ID: ");int    id  = input.nextInt();
                System.out.print("Enter GPA: ");       double gpa = input.nextDouble();
                Student s = new Student(f,l,id,gpa);
                db.add(s);
                //db.add(new Student(f, l, id,gpa));
            }
            else if (c==2) {
                for (Student s: db)
                    printStu(s);
            }
            else if (c==3) {
                System.out.print("Enter Student ID: "); int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index != -1) {
                    printStu(db.get(index));
                }
                else System.out.println("No Student was found with that ID.");
            }
            else if (c==4) {
                System.out.print("Enter Last Name: "); String last = input.next();
                int index = indexOfStu(db, last);
                if (index != -1) {
                    printStu(db.get(index));
                }
                else System.out.println("No Student was found with that Last Name.");
            }
            else if (c==5) {
                System.out.print("Enter Student ID: "); int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) {
                    System.out.println("No Student was found with that ID.");
                }
                else {
                    System.out.println("Enter New GPA: "); double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA successfully updated");
                }
            }
            else if (c==6) {
                System.out.print("Enter Student ID: "); int id = input.nextInt();
                int index = indexOfStu(db, id);
                if (index == -1) {
                    System.out.println("No Student was found with that ID.");
                }
                else {
                    db.remove(index);
                }
            }
            else if (c==7) {
                return;
            }
        }
    }
}
