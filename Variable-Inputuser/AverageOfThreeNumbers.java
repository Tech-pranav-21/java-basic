import java.util.Scanner;
import java.util.SortedMap;

public class AverageOfThreeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 Number :- ");
        int x = sc.nextInt();

        System.out.print("Enter 2 Number :- ");
        int y = sc.nextInt();

        System.out.print("Enter 3 Number :- ");
        int z = sc.nextInt();

        double a = x  + y + z ;

        double average = a/3;
        System.out.print("Average of Three Number :- " + average);

        sc.close();
    }
}
