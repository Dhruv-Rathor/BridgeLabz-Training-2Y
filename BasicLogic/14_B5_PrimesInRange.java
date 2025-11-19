/**
 * Objective B5: Counts the number of prime numbers within a specified range.
 */
public class B5_PrimesInRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int primeCount = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }

        System.out.println("Number of primes between " + start + " and " + end + " is: " + primeCount);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
