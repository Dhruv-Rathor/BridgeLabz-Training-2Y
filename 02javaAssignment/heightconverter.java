import java.util.Scanner;

public class heightconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        
        System.out.println("your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        
        input.close();
    }
}
