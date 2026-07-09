import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Length :- ");
        int l = sc.nextInt();

        System.out.print("Breadth :- ");
        int b = sc.nextInt();

        int Perimeter = 2 * ( l + b );  //Another Formula is Perimeter=l+b+w
        System.out.print("Perimeter :- " + Perimeter);

        sc.close();
    }
}
