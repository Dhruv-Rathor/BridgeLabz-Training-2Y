/**
 * Objective A3: Returns the last digit of a number using the modulo 10 operator.
 */
public class A3_ReturnLastDigit {
    public static void main(String[] args) {
        int number = 1987;
        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is: " + lastDigit);
    }
}
