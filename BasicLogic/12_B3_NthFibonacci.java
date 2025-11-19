/**
 * Objective B3: Finds the Nth Fibonacci number using an iterative approach.
 */
public class B3_NthFibonacci {
    public static void main(String[] args) {
        int n = 10;
        long a = 0;
        long b = 1;
        long result = a;

        if (n == 1) {
            result = b;
        } else {
            for (int i = 2; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }

        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
