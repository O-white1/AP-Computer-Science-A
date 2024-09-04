package Q1;
import java.util.Scanner;

public class Prog54b {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        int sum;
        double avg;

        Scanner numScanner = new Scanner(System.in);
        System.out.print("Enter 4 numbers.");

        num1 = numScanner.nextInt();
        num2 = numScanner.nextInt();
        num3 = numScanner.nextInt();
        num4 = numScanner.nextInt();


        sum = (num1+num2+num3+num4);
        avg = ((double)sum / 4);

        System.out.println("Sum: " + sum + "\nAverage: " + avg);
    }
}

/*

C:\Users\white.o3\.jdks\openjdk-22.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=62964:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\white.o3\IdeaProjects\AP-Computer-Science-A\out\production\AP-Computer-Science-A Q1.Prog54b
Enter 4 numbers.2
2
2
2
Sum: 8
Average: 2.0

Process finished with exit code 0*/
