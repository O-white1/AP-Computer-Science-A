package Q2;

public class BigArray {
    public static void main(String[] args) {
        //1.
        System.out.println("1.");
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
        // 10.
        for (int num: array) // REVISIT WITH FUNCTIONAL TALK WITH SZELL
            if (num >= 50 && num <=59)
                System.out.print(num + " ");
        System.out.println();
        //11.
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv]%4==0) System.out.print(array[lcv] + " ");
        }
        System.out.println();
        // 12.
        boolean isSixty = false;
        for (int n: array) {
            if (n == 60) isSixty = true;
        }
        System.out.println("Is 60 in the list: " + isSixty);
        // 13.
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] != array[array.length-1]) same = false;

        }
        System.out.println("Is the array palindromic: " + same);
        //14.
        double average = 0;
        for (int x: array) average+= x;
        average /= array.length;

        int avgCount = 0;
        for (int x: array) {
            if (x > average) avgCount++;
        }
        System.out.printf("there are %d numbers greater than the average\n", avgCount);
        // 15.

        int evenCount = 0;
        for (int x: array) {
            if (x % 2 == 0) evenCount++;
        }
        System.out.println("Number of Evens: " + evenCount);
        // 16.
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[lcv] = array[(array.length)-1];
        }
        for (int n: array2)
            System.out.print(n + " ");
        System.out.println();
        // 17.
        int[] shiftArray = CircRight(array);
        for (int n: shiftArray) System.out.print(n + " ");


        // 18.
        int sum = 0;
        for (int num: array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("The sum of all digits of all nums in array: " + sum);


    }

    public static int[] CircRight(int[] array) {
        int temp = array[array.length-1];
        int[] shifted = new int[array.length];
        for (int lcv=1; lcv<array.length; lcv++) {
            shifted[lcv] = array[lcv-1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
