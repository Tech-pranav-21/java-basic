import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Price :- ");
        int price = sc.nextInt();

        int discount = 200;
        System.out.println("200 off what you buy");

        price -= discount;

        System.out.println("Final price" + price);

    }
}
