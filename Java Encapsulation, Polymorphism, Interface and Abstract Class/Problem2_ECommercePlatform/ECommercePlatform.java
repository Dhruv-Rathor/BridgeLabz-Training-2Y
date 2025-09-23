import java.util.ArrayList;
import java.util.List;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { if (price > 0) this.price = price; }
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.10; }
    @Override public double calculateTax() { return getPrice() * 0.18; }
    @Override public String getTaxDetails() { return "GST: 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.20; }
    @Override public double calculateTax() { return getPrice() * 0.12; }
    @Override public String getTaxDetails() { return "GST: 12%"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }
    @Override public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Laptop", 1200));
        products.add(new Clothing("C001", "T-Shirt", 25));
        products.add(new Groceries("G001", "Apples", 5));

        for (Product product : products) {
            double finalPrice = product.getPrice() - product.calculateDiscount();
            if (product instanceof Taxable) {
                finalPrice += ((Taxable) product).calculateTax();
            }
            System.out.println("Product: " + product.getName() + ", Final Price: $" + String.format("%.2f", finalPrice));
        }
    }
}
