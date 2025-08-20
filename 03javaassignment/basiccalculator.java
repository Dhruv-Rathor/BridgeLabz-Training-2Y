import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("division by zero is not allowed");
        }

        System.out.println("the addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 +
                           " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}

