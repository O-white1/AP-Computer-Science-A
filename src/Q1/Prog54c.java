package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {

        Scanner RadScan = new Scanner(System.in);
        double pi = 3.14159;
        double radius;
        double circumference;
        double area;

        System.out.println("Enter Radius: ");
        radius = RadScan.nextDouble();

        area = pi*(Math.pow(radius, 2));
        circumference = (2 * pi * radius);

        System.out.println("Area: " + area + "\nCircumference: " + circumference);
    }
}
/*
C:\Users\white.o3\.jdks\openjdk-22.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64301:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\white.o3\IdeaProjects\AP-Computer-Science-A\out\production\AP-Computer-Science-A Q1.Prog54c
Enter Radius:
12
Area: 452.38896
Circumference: 75.39815999999999

Process finished with exit code 0

 */
