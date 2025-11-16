import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    
    Product(String n, double p) {
        this.name = n;
        this.price = p;
    }
    
    public String toString() {
        return this.name + ": $" + this.price;
    }
}

public class EcommerceSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.50));
        products.add(new Product("Mouse", 25.00));
        products.add(new Product("Keyboard", 75.00));
        
        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
        
        products.sort(byPrice);
        
        System.out.println("Products sorted by price:");
        for(Product p : products) {
            System.out.println(p);
        }
    }
}
