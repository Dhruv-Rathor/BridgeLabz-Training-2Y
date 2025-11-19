import java.util.HashMap;
import java.util.Map;

/**
 * Objective B8: Counts the number of digits that appear exactly once (non-repeated) in an integer.
 */
public class B8_CountNonRepeatedDigits {
    public static void main(String[] args) {
        int number = 1213455;
        Map<Integer, Integer> digitCounts = new HashMap<>();
        int temp = number;
        int nonRepeatedCount = 0;

        // 1. Count frequencies
        if (number == 0) {
            digitCounts.put(0, 1);
        } else {
            while (temp != 0) {
                int digit = temp % 10;
                digitCounts.merge(digit, 1, Integer::sum);
                temp /= 10;
            }
        }

        // 2. Count non-repeated digits (frequency == 1)
        for (int count : digitCounts.values()) {
            if (count == 1) {
                nonRepeatedCount++;
            }
        }

        System.out.println("The number of non-repeated digits in " + number + " is: " + nonRepeatedCount);
    }
}
