import java.util.Scanner;

public class ConvertMinutes {
    public static void main(String[] args) {
        // 1. Setup User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total seconds: ");

        // 2. Store in a Variable
        int totalSeconds = scanner.nextInt();

        // 3. Do the Math (Variables & Operators)
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // 4. Output the result
        System.out.println("Result: " + hours + "h " + minutes + "m " + seconds + "s");

        scanner.close();
    }
}
