package IfElse;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 Number :- ");
        int x = sc.nextInt();

        System.out.print("Enter 2 Number :- ");
        int y = sc.nextInt();

        if(x > y)
            System.out.println("It is Greater Number 1 :- " +x);
        else
            System.out.println("It is Greater Number 2 :- " +y);
        sc.close();

    }
}
