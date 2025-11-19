import java.util.HashSet;
import java.util.Set;

/**
 * Objective B7: Counts the number of unique digits in an integer using a Set.
 */
public class B7_CountUniqueDigits {
    public static void main(String[] args) {
        int number = 1223455;
        Set<Integer> uniqueDigits = new HashSet<>();
        int temp = number;

        if (number == 0) {
            uniqueDigits.add(0);
        } else {
            while (temp != 0) {
                uniqueDigits.add(temp % 10);
                temp /= 10;
            }
        }

        System.out.println("The number of unique digits in " + number + " is: " + uniqueDigits.size());
    }
}
