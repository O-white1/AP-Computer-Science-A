package Q1;
import java.util.Scanner;

public class lpFour_Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangular Prism");
        System.out.print("Enter Width: "); int width = sc.nextInt();
        System.out.print("Enter Height: "); int height = sc.nextInt();
        System.out.print("Enter length: "); int length = sc.nextInt();
        int RectVolume = width * height * length;
        System.out.println("Volume: " + RectVolume);

        System.out.println("\nSphere");
        System.out.print("Enter Radius: "); int radius = sc.nextInt();
        double diameter = radius + radius;
        double SphereVolume = (3.14*(Math.pow((diameter), 3))) /6;
        System.out.println("Volume: " + SphereVolume);

        System.out.println("\nCube");
        System.out.print("Enter The length of each side: "); int side = sc.nextInt();
        int volume = side*side*side;
        System.out.println("Volume: " + volume);
    }
}
