/**
 * Objective A1: Checks if a given number is even using the modulo operator (%).
 */
public class A1_IsEven {
    public static void main(String[] args) {
        int number = 42;
        boolean isEven = (number % 2 == 0);
        System.out.println("Is " + number + " even? " + isEven);
    }
}
