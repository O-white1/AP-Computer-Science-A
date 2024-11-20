package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {

    public static void printCat(Cat cat) {
        System.out.printf("%s\t%f\t%d\t$%.2f", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("langdat/bigarraylist.dat"));
            int numcats = file.nextInt();
            file.nextLine();
            Cat[] cats = new Cat[50];

            for (int lcv=0;lcv<numcats;lcv++) {
                String n = file.nextLine();
                double w = file.nextDouble();
                int    a = file.nextInt();
                double c = file.nextDouble();
                file.nextLine();

                cats[lcv] = new Cat(n,w,a,c);
            }
            // 1.
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv=0;lcv<numcats;lcv++) {
                printCat(cats[lcv]);
            }
            //2.
            System.out.println("2.The third cat is named: " + cats[2].getName());
            //3.
            cats[numcats-1].setWeight(cats[numcats-1].getWeight() + 10);
            System.out.println("3. Updated Weight is: " + cats[numcats-1].getWeight());
            //4.
            int rascalIndex = 0;
            for (int i=0;i<numcats;i++) {
                if (cats[i].getName().equals("Rascal")) rascalIndex = i;
            }
            for (int i = rascalIndex; i<numcats-1; i++) {
                cats[i] = cats[i+1];
            }
            numcats--;
            //5.
            // for (int i=numcats+1;i-->1;)
            for (int i = numcats-1; i>1; i--) {
                cats[i] = cats[i-1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numcats++;

            //6.
            cats[numcats] = new Cat("Gimpy", 14.3, 10, 29.99);
            //7.
            System.out.println("\nThe Updated List is:");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat: cats)
                if (cat != null) printCat(cat);
            //8.
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numcats] = temp;
            numcats++;
            //9.
            Cat TempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = TempCat;
            //10.
            System.out.println("\n10. the current cat names are:");
            for (Cat cat: cats)
                if (cat != null) System.out.print(cat.getName() + "\t");
            System.out.println();

            //11.
            int k = 0;
            while (k<numcats) {
                if (cats[k].getCost()<26) {
                    for (int j = k ; j < numcats-1; j++) {
                        cats[j] = cats[j+1];
                    }
                    numcats--;
                }
                else {
                    k++;
                }
            }
            System.out.println("11. The cats costing >= 26 dollars are: ");
            for (int c = 0; c < numcats; c++) {
                System.out.println(cats[c].getCost() + " ");
            }
            System.out.println();

            //12.
            System.out.println("\n12.Cats being put on a diet are:");
            for (int lcv=0;lcv<numcats;lcv++) {
                Cat cat = cats[lcv];
                if (cat.getWeight() > 15) System.out.println(cat.getName() + "\t");
            }
            System.out.println();




            while (file.hasNext()) {

            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
