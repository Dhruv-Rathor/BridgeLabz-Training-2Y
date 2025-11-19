/**
 * Objective A2: Checks if a given number is odd using the modulo operator (%).
 */
public class A2_IsOdd {
    public static void main(String[] args) {
        int number = 17;
        boolean isOdd = (number % 2 != 0);
        System.out.println("Is " + number + " odd? " + isOdd);
    }
}
