import java.util.Scanner;

public class trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("enter height in cm: ");
        double heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;
        double areaInches = areaCm / (2.54 * 2.54); 

        System.out.println("the area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);

        input.close();
    }
}
