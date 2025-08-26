import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100; // convert cm to meters
        double bmi = weight / (heightM * heightM);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5)
            System.out.println("Status: Underweight");
        else if (bmi < 25)
            System.out.println("Status: Normal weight");
        else if (bmi < 30)
            System.out.println("Status: Overweight");
        else
            System.out.println("Status: Obese");
    }
}
