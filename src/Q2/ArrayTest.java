package Q2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i+1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            System.out.println();
        }
        char[] hello = "Hello, world!".toCharArray();
        for (char c : hello) {
            System.out.print(c);
            System.out.println();
        }
        String[] words = {"Hello", "world!", "wow", "coolBeans"};
        for (String word : words) {
            System.out.println(word);
        }

    }
}
