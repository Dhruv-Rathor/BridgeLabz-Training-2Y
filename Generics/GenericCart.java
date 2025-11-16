import java.util.List;
import java.util.ArrayList;

class Electronics {
    String name;
    public Electronics(String name) { this.name = name; }
    public String toString() { return "Electronic: " + name; }
}

class Clothing {
    String name;
    public Clothing(String name) { this.name = name; }
    public String toString() { return "Clothing: " + name; }
}

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added to cart: " + item);
    }

    public void removeItem(T item) {
        items.remove(item);
        System.out.println("Removed from cart: " + item);
    }

    public void displayItems() {
        System.out.println("--- Cart Contents ---");
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Phone"));
        electronicsCart.displayItems();
        
        // This line would cause a compile error:
        // electronicsCart.addItem(new Clothing("Shirt"));

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        clothingCart.displayItems();
    }
}
