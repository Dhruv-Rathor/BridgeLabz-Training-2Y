import java.util.*;
class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n% 5 == 0) {
            System.out.println("No. is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}
