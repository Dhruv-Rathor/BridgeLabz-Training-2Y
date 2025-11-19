/**
 * Objective B12: Calculates both the sum of even digits and the sum of odd digits in a single pass.
 */
public class B12_DigitSumEvenOrOdd {
    public static void main(String[] args) {
        int number = 987654321;
        int sumEven = 0;
        int sumOdd = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            temp /= 10;
        }

        System.out.println("For number " + number + ":");
        System.out.println("Sum of Even Digits: " + sumEven);
        System.out.println("Sum of Odd Digits: " + sumOdd);
    }
}
