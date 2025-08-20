
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner radii= new Scanner(System.in);
        System.out.println("Enter radius");
        int radius= radii.nextInt();
        int area =(radius)*radius*22/7;
        System.out.println("area is "+area);

    }
    
}
