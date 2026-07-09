public class SwappingNumber {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int temp;

        System.out.println("Before Swapping:");
        System.out.println("x =  " + x);
        System.out.println("y =  " + y);

        // Swap here

        temp = x;
        x = y;
        y = temp;

        System.out.println("After Swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}