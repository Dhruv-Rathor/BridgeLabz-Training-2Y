import java.util.Scanner;
public class impleintrest{
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);

        System.out.println("Enter the rate:");
        double rate = vol.nextDouble();
        System.out.println("Enter the principle:");
        double principle = vol.nextDouble();
        
        System.out.println("Enter the time:");
        double time = vol.nextDouble();
        double si = (principle*rate*time)/100;

        System.out.println("The Simple Intrest  is: " + si);
        vol.close();
    }}
