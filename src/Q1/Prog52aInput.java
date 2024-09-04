package Q1;
import java.util.*;

import java.util.Scanner;

public class Prog52aInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Length: "); int len = input.nextInt();
        System.out.print("Enter Width: ");    int wid = input.nextInt();
        int perim = (len*2)+(wid*2);
        System.out.println("Area: " + len*wid);
        System.out.println("Perimeter: " + perim);
    }
}
/*C:\Users\white.o3\.jdks\openjdk-22.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=56957:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\white.o3\IdeaProjects\AP-Computer-Science-A\out\production\AP-Computer-Science-A Q1.Prog52aInput
Enter Length: 12
Enter Width: 12
Area: 144
Perimeter: 48

Process finished with exit code 0 */