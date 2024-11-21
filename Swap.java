public class Swap {
    public static void main(String[] args) {
        int a = 23;
        int b = 46;

        System.out.println("a is " + a + " b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping , a is " + a + " b is " + b);
    }
}
