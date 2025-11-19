/**
 * Objective A5: Calculates the sum of the last digits of two given numbers.
 */
public class A5_SumOfLastDigits {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 458;
        int sumOfLastDigits = (num1 % 10) + (num2 % 10);
        System.out.println("The sum of last digits of " + num1 + " and " + num2 + " is: " + sumOfLastDigits);
    }
}
