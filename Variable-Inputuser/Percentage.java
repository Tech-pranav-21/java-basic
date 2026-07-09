import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Science :- ");
        int s = sc.nextInt();

        System.out.print("Math :- ");
        int m = sc.nextInt();

        System.out.print("English :- ");
        int e = sc.nextInt();

        System.out.print("History :- ");
        int h = sc.nextInt();

        System.out.print("Marathi :- ");
        int ma = sc.nextInt();

        int sum = s + m + e + h + ma ;
        System.out.println("Total Marks " + sum);

        float total = (sum / 250f) * 100;
        System.out.print("Percentage :-  " + total + "%");

        sc.close();

    }
}
