import java.util.Scanner;

public class universityfee1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the fee: ");
        double fee = input.nextDouble();

        System.out.print("enter the discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("the discount amount is inr " + discount + " and final discounted fee is inr " + finalFee);

        input.close();
    }
}
