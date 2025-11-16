import java.util.List;
import java.util.ArrayList;

interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String toString() { return name + " ($" + price + ")"; }
}

public class OnlineMarketplace {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1.0 - percentage / 100.0);
        product.setPrice(newPrice);
        System.out.println("Applied " + percentage + "% discount to " + product.toString());
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java 101", 50.00, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.00, new ClothingCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);

        System.out.println("Original price: " + book);
        applyDiscount(book, 10);
        
        System.out.println("Original price: " + shirt);
        applyDiscount(shirt, 15);
    }
}
