import java.util.Scanner;

public class BMICalculator {
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // weight, height
        String[][] result = new String[10][4]; // height, weight, BMI, Status

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double heightM = data[i][1] / 100;
            double bmi = data[i][0] / (heightM * heightM);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }
}
