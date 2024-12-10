package Q2;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //Dynamic array/list operations:
        // add(obj), add(index, obj)--inset, remove(index), get, set(index, obj), size
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<WrapperType>
        for (int i = 0; i < 100; i++) {
            int rand = (int)(Math.random()*100)+1;
            list.add(rand);
        }
        for (int i = 0; i < list.size(); i+=2) {
            System.out.print(list.get(i)+" ");
            System.out.println();
        }
        // .contains, .indexOf
        System.out.println("Does List Contain 50?" + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));
        list.add(2, 999);
        list.set(0, 123);
        for (int num: list) {
            System.out.println(num);
        }

    }
}






