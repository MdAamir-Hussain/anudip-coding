public class Fibonacci {
    public static void printFibonacci(int count) {

        int a = 0, b = 1, c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFibonacci(15);
    }
}
