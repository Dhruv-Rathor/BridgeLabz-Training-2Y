import java.util.Scanner;

public class trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("enter height in inches: ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;  // 1 square inch = 6.4516 square cm

        System.out.println("the area of triangle is " + areaInches + " square inches and " + areaCm + " square centimeters");

        input.close();
    }
}
