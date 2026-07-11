package IfElse;

import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("1st Number :- ");
        int x = sc.nextInt();

        System.out.print("2nd Number :- ");
        int y = sc.nextInt();

        System.out.print("3rd Number :- ");
        int z = sc.nextInt();

        if (x > y && x > z){
            System.out.println("1st Number is Greater :- " + x);
        }else if (y > x && y > z){
            System.out.println("2nd Number is Greater :- " +y);
        } else if (z > x  &&  z > y) {
            System.out.println("3rd Number is Greater :- " +z);
        }else if (x >= y && x >= z){
            System.out.println("Number is equal");
        }
        sc.close();

    }
}
