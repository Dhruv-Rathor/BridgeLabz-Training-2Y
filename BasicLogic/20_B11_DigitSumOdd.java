/**
 * Objective B11: Calculates the sum of only the odd digits in an integer.
 */
public class B11_DigitSumOdd {
    public static void main(String[] args) {
        int number = 123456;
        int sumOdd = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                sumOdd += digit;
            }
            temp /= 10;
        }

        System.out.println("The sum of odd digits in " + number + " is: " + sumOdd);
    }
}
