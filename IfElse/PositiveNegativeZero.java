package IfElse;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value :- ");
        int x = sc.nextInt();

        if(0 < x){
            System.out.println("It is Positive Number  ");
        }else if (0 == x){
            System.out.println("It is Zero Number ");
        }else  {
            System.out.println("It is Negative Number ");
        }
        sc.close();

    }
}
