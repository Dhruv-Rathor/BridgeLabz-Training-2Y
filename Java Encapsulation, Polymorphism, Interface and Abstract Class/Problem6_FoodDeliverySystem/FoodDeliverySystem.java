import java.util.ArrayList;
import java.util.List;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    protected double price;
    protected int quantity;

    public FoodItem(double price, int quantity) { this.price = price; this.quantity = quantity; }
    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(double price, int qty) { super(price, qty); }
    @Override public double calculateTotalPrice() { return price * quantity; }
    @Override public double applyDiscount() { return calculateTotalPrice() * 0.10; }
    @Override public String getDiscountDetails() { return "10% off"; }
}

class NonVegItem extends FoodItem {
    public NonVegItem(double price, int qty) { super(price, qty); }
    @Override public double calculateTotalPrice() { return (price + 1.5) * quantity; }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem(8.0, 1));
        order.add(new NonVegItem(12.0, 2));

        double totalBill = 0;
        for (FoodItem item : order) {
            double itemPrice = item.calculateTotalPrice();
            if (item instanceof Discountable) { itemPrice -= ((Discountable) item).applyDiscount(); }
            totalBill += itemPrice;
        }
        System.out.println("Grand Total: $" + String.format("%.2f", totalBill));
    }
}
