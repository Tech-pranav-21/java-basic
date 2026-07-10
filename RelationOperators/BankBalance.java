import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args)
    {
        double accountBalance = 5000.00;
        System.out.println("Initial Balance: ₹" + accountBalance);

        // Deposit ₹1000 using the += operator
        double depositAmount = 1000.00;
        accountBalance += depositAmount;

        // Display the updated balance
        System.out.println("Deposit Amount: ₹" + depositAmount);
        System.out.println("Updated Balance: ₹" + accountBalance);
    }
}

