/**
 * Objective A9: Counts both even and odd numbers in a fixed array using a single loop.
 */
public class A9_CountEvenOrOdd {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 19, 24, 33};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("The numbers are: 7, 12, 19, 24, 33");
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}
