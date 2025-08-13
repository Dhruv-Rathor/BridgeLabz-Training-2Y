import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter in degree");
            int degree  = input.nextInt();
            int total= (degree*9 / 5 )+32;
            System.out.println("Your in celsius"+degree +" *is "+total+" fahrenheit");

        
    }
}
