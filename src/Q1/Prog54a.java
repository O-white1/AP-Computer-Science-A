package Q1;
import java.util.*;

public class Prog54a {
     public static void main(String[] args) {

         Scanner keyboard = new Scanner(System.in);

         System.out.print("Enter the car model: ");
         String model = keyboard.nextLine();

         System.out.print("Miles driven: ");
         int miles = keyboard.nextInt();
         // double miles = keyboard.nextDouble();

         System.out.print("Enter gallons used: ");
         int gallons = keyboard.nextInt();

         double mpg = miles / (double)gallons;
         System.out.println("MPG used by:" + model + " is " + mpg + " m/g");
     }
}
/*
C:\Users\white.o3\.jdks\openjdk-22.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=63027:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\white.o3\IdeaProjects\AP-Computer-Science-A\out\production\AP-Computer-Science-A Q1.Prog54a
Enter the car model: goofy
Miles driven: 286
Enter gallons used: 9
MPG used by:goofy is 31.77777777777778 m/g

Process finished with exit code 0

 */