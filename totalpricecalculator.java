import java.util.Scanner;

public class totalpricecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("the total purchase price is inr " + totalPrice + " if the quantity " + quantity + " and unit price is inr " + unitPrice);

        input.close();
    }
}
