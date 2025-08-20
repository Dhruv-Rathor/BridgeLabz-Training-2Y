import java.util.Scanner;

public class distanceconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;  
        double distanceInMiles = distanceInYards / 1760; 

        System.out.println("the distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}
