/**
 * Objective B9: Calculates the sum of all digits in an integer using a loop.
 */
public class B9_DigitSumAll {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("The sum of all digits in " + number + " is: " + sum);
    }
}
