package Q2.Project2;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class TodoListMain {
    public static void sort(ArrayList<Item> list) {
        Item[] copy = list.toArray(new Item[list.size()+1]);
        for (int lcv = 0; lcv < list.size()-1; lcv++) {
            if (copy[lcv].myPriority>(copy[lcv+1].myPriority)) {
                Item temp = list.get(lcv);
                Item i2 = list.get(lcv+1);
                list.set(lcv, i2);
                list.set(lcv+1, temp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("(1): New Item\n(2): Mark Item Complete\n(3): Print All Items\n(4): Exit");
            int decision = input.nextInt();

            if (decision==1) {
                System.out.println("Item Name: ");String name = input.next();
                System.out.println("Item Priority (Lower means higher priority): ");int priority = input.nextInt();
                System.out.println("Today's date: ");String date = input.next();
                list.add(new Item(name, date, priority));
            }
            if (decision==2) {
                System.out.println("Which Item would you like to mark complete?");
                for (int lcv = 0; lcv < list.size(); lcv++) {
                    System.out.printf(list.get(lcv).myName + "(%d)\n", lcv);
                }
                int choice = input.nextInt();
                list.remove(choice);
                System.out.println("Item successfully marked as complete!");
            }
            if (decision==3) {
                sort(list);
                System.out.println("Items:");
                for (Item item : list) {
                    System.out.println(item.myName + "\t" + item.myPriority + "\t " + item.myDate);
                }
                System.out.println("____________");
            }
            if (decision==4) {
                input.close();
                return;
            }
        }
    }
}