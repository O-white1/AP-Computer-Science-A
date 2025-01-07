package Q2;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BigArrayListCat {

    public static void printCat(Cat cat) {
        System.out.printf("%s\t%.2f\t%d\t%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }



    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("langdat/bigarraylist.dat"));

            int numCats = file.nextInt();
            file.nextLine();
            ArrayList<Cat> cats = new ArrayList<>();

            while (file.hasNext()) {
                for (int lcv = 0; lcv < numCats; lcv++) {
                    String n = file.nextLine();
                    double w = file.nextDouble();
                    int    a = file.nextInt();
                    double c = file.nextDouble();
                    file.nextLine();
                    cats.add(new Cat(n, w, a, c));
                }
                //1
                System.out.println("1.\nName\nWeight\nAge\nCost\n");
                for (Cat cat: cats)
                    printCat(cat);

                //2
                System.out.println("\n2. The third cat is named: " + cats.get(2).getName());

                //3
                cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
                System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

                //4.
                for (int i = 0; i < cats.size(); i++) {
                    if (cats.get(i).getName().equals("Rascal")) {
                        cats.remove(i);
                        numCats--;
                    }
                }

                //5
                cats.add(1, new Cat("Angel", 3.6, 1, 25.99));

                //6
                cats.add(new Cat("Gimpy", 14.3, 10, 25.99));

                //7
                System.out.println("7. The updated list is: ");
                for (Cat cat: cats) {
                    printCat(cat);
                }

                //8
                Cat third = cats.get(2);
                cats.set(2, new Cat("Sugar", 23.6, 7, 32.25));
                cats.add(third);

                //9
                Cat temp  = cats.get(1);
                cats.set(1, cats.get(3));
                cats.set(3, temp);
                //10
                System.out.println("10. The names of all cats are: ");
                for (Cat cat: cats)
                    System.out.println(cat.getName());
                System.out.println();

                //11
                for (int lcv = 0; lcv < cats.size(); lcv++) {
                    if (cats.get(lcv).getCost()<26) {
                        cats.remove(lcv);
                        lcv--;
                    }
                }
                System.out.println("11. Cats costs: ");
                for (Cat cat: cats)
                    System.out.print(cat.getCost() + "\t");
                System.out.println();

                //12.
                System.out.println("12. The cats being put on a diet are: ");
                for (int i = 0; i < cats.size(); i++) {
                    if (cats.get(i).getWeight() > 15.0) {
                        System.out.println(cats.get(i).getName());
                    }
                }
                System.out.println();
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
