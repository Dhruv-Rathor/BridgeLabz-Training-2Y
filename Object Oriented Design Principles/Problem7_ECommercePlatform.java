import java.util.ArrayList;
import java.util.List;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    private static int orderCount = 0;
    public int orderId;
    public List<Product> products;
    public Customer customer;

    public Order(Customer customer) {
        this.orderId = ++orderCount;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}

class Customer {
    public String name;
    public List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public Order placeOrder() {
        Order newOrder = new Order(this);
        this.orderHistory.add(newOrder);
        System.out.println("Order " + newOrder.orderId + " placed by " + this.name);
        return newOrder;
    }
}

public class Problem7_ECommercePlatform {
    public static void main(String[] args) {
        Customer c1 = new Customer("David");
        
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        
        Order davidOrder = c1.placeOrder();
        davidOrder.addProduct(p1);
        davidOrder.addProduct(p2);
        
        System.out.println("Total price for Order " + davidOrder.orderId + ": $" + davidOrder.getTotalPrice());
    }
}
