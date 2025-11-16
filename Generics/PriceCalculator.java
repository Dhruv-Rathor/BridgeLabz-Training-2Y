import java.util.List;
import java.util.Arrays;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() { return price; }
    public String toString() { return name + " - $" + price; }
}

class Mobile extends Product {
    public Mobile(String name, double price) { super(name, price); }
}

class Laptop extends Product {
    public Laptop(String name, double price) { super(name, price); }
}

public class PriceCalculator {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(
            new Mobile("Phone A", 800),
            new Mobile("Phone B", 500)
        );
        
        List<Laptop> laptops = Arrays.asList(
            new Laptop("Laptop X", 1200),
            new Laptop("Laptop Y", 1500)
        );

        System.out.println("Total mobile price: " + calculateTotal(mobiles));
        System.out.println("Total laptop price: " + calculateTotal(laptops));
    }
}
