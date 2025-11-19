/**
 * Objective A7: Counts how many numbers in a fixed array are even.
 */
public class A7_CountEven {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 31, 40};
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("The numbers are: 10, 15, 22, 31, 40");
        System.out.println("Number of even numbers: " + evenCount);
    }
}
