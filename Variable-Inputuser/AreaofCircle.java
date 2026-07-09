import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius :- ");
        int r = sc.nextInt();

        double pi = 3.14;

        double Area = pi * r *r ;

        System.out.println("Area of Circle :- " +Area);

        sc.close();
    }
}
