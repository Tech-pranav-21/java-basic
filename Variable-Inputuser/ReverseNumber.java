import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers :- ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int temp = x;
        x = z;
        z = temp;

        System.out.println("Reverse Numbers :- ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}