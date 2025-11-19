import java.util.LinkedHashMap;
import java.util.Map;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        // 1. Add products in the order they are added to cart
        cart.put("Laptop", 4500.00);
        cart.put("Mouse", 500.00);
        cart.put("Keyboard", 1200.00);
        cart.put("Monitor", 3000.00);

        // 2. Display products in order of addition
        System.out.println("Shopping Cart (Order of Addition):");
        cart.forEach((product, price) -> System.out.printf("- %s: %.2f%n", product, price));

        // 3. Calculate the total bill amount
        double totalBill = calculateTotal(cart);
        System.out.printf("\nSubtotal: %.2f%n", totalBill);

        // 4. Apply a 10% discount if the total exceeds 5000
        double finalTotal = totalBill;
        if (totalBill > 5000.00) {
            finalTotal *= 0.90;
            System.out.printf("10%% Discount Applied!%n");
        }
        System.out.printf("Final Bill Amount: %.2f%n", finalTotal);

        // 5. Remove any item if its quantity becomes zero (simulate user removing items)
        cart.remove("Mouse");
        System.out.println("\nAfter removing Mouse:");
        cart.forEach((product, price) -> System.out.printf("- %s: %.2f%n", product, price));
        System.out.printf("New Total: %.2f%n", calculateTotal(cart));
    }

    public static double calculateTotal(Map<String, Double> cart) {
        return cart.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
