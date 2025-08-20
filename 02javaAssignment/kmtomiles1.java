import java.util.Scanner;

public class kmtomiles1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter distance in kilometers: ");
        double km = input.nextInt();

        double miles = km / 1.6;

        System.out.println("the total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
