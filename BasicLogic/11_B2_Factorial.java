/**
 * Objective B2: Calculates the factorial of a number using a loop.
 */
public class B2_Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
