import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length :- ");
        int l = sc.nextInt();

        System.out.print("Breadth :- ");
        int b = sc.nextInt();

        int Area = l * b; // another formula is length * width
        System.out.println("Area of Rectangle :- " + Area);

        sc.close();
    }
}
