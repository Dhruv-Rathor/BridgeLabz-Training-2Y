/**
 * Objective A6: Checks if number N is an exact multiple of number M using the modulo operator.
 */
public class A6_IsExactMultiple {
    public static void main(String[] args) {
        int N = 75;
        int M = 5;
        boolean isMultiple = (N % M == 0);
        System.out.println(N + " is an exact multiple of " + M + "? " + isMultiple);
    }
}
