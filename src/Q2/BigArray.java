package Q2;

public class BigArray {
    public static void main(String[] args) {
        //1.
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20); // Math.random() * (max-min)+min
        }
        // 2.
        for (int i = 0; i < array.length; i++) {System.out.print(array[i] + " ");}System.out.println();
        for (int temp: array)                  {System.out.print(temp     + " ");}System.out.println();
        //3.
        System.out.println("Middle Number: " + array[array.length/2]);
        //4.
        double avg = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of first, middle, and last: "+(avg/3));
        //5.
        int smallest = array[0];
        int largest  = array[0];
        for (int num: array) {
            if (num < smallest) smallest = num;
            if (num > largest)  largest  = num;
        }
        System.out.println("Smallest: " + smallest + "\nLargest: " + largest);
        //6.
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest)  largeIndex = i;
        }
        int tempswap = array[smallIndex]; // 3 line 2 variable swap!
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;
        for (int x: array) {
            System.out.print(x+ "");
        }
        System.out.println();
        // 7.
        int randNum = (int)(Math.random() * 10 + 1); // (10-1)+1
        array[array.length/2] = randNum;
        for (int x: array) {
            System.out.print(x+ "");
        }
        // 8.
        for (int i=0; i<array.length; i++) array[i] += 10;
        for (int x: array) System.out.print(x+ " ");
        // 9.
        int myThird = array[2];
        array[2] = 5;
        System.out.println("outed num: " + myThird);
    }
}
