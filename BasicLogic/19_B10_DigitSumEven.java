/**
 * Objective B10: Calculates the sum of only the even digits in an integer.
 */
public class B10_DigitSumEven {
    public static void main(String[] args) {
        int number = 123456;
        int sumEven = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            }
            temp /= 10;
        }

        System.out.println("The sum of even digits in " + number + " is: " + sumEven);
    }
}
