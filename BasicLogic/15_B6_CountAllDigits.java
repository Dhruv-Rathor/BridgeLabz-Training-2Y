/**
 * Objective B6: Counts the total number of digits in an integer using repeated division.
 */
public class B6_CountAllDigits {
    public static void main(String[] args) {
        int number = 123456;
        int count = 0;
        int temp = number;

        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
