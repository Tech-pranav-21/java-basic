public class BasicIncrementAndDecrement {
    public static void main(String[] args) {
        int x = 5;
        x ++  ;
        System.out.println(x);

        x --  ;
        System.out.println(x);

        x++;
        x++;
        x++;
        System.out.println(x*x*x);

        x--;
        x--;
        x--;
        x--;
        x--;
        x--;
        System.out.println(x);

        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(x);
        System.out.println(--x);

    }
}
