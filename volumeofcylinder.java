import java.util.Scanner;

public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);

        System.out.println("Enter the height:");
        double height = vol.nextDouble();

        System.out.println("Enter the radius:");
        double radius = vol.nextDouble();

        double volume = 3.14 * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);
    }


        

    }

