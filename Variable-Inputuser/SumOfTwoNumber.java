import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your 1st Number :- ");
        int x = sc.nextInt();
        System.out.print("Enter your 2nd Number :- ");
        int y = sc.nextInt();

        int Total = x+y;
        System.out.println("Total :- " + Total);

        sc.close();

    }
}
