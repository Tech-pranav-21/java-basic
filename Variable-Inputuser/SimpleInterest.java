import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal :- ");
        int p = sc.nextInt();

        System.out.print("Rate :- ");
        int r = sc.nextInt();

        System.out.print("Time taken :- ");
        int t = sc.nextInt();

        int total = p * r * t;

        int interest = total / 100;
        System.out.print("Simple Interest :- " + interest);

        sc.close();

    }
}
