package IfElse;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Year :- ");
        int year = sc.nextInt();

        if(year % 4 == 0)
            System.out.println("It is a Leap Year");
        else
            System.out.println("Not Leap Year");
        sc.close();
    }

}
