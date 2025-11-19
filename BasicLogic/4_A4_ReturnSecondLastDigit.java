/**
 * Objective A4: Returns the second last digit of a number using division (/) and modulo (%).
 */
public class A4_ReturnSecondLastDigit {
    public static void main(String[] args) {
        int number = 54321;
        int secondLastDigit = (number / 10) % 10;
        System.out.println("The second last digit of " + number + " is: " + secondLastDigit);
    }
}
