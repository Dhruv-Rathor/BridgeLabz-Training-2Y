/**
 * Objective B1: Checks if a number is prime using a trial division loop.
 */
public class B1_IsPrime {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(number + " is prime? " + isPrime);
    }
}
