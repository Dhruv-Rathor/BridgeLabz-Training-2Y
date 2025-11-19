/**
 * Objective A8: Counts how many numbers in a fixed array are odd.
 */
public class A8_CountOdd {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 31, 40};
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("The numbers are: 10, 15, 22, 31, 40");
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
