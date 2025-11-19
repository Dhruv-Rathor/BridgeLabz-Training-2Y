import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add new products
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 20);

        System.out.println("Initial Inventory: " + inventory);

        // 2. Customer buys, reduce quantity
        reduceQuantity(inventory, "Laptop", 3);
        reduceQuantity(inventory, "Mouse", 55); // Goes to zero/below
        reduceQuantity(inventory, "Keyboard", 10);

        System.out.println("After Sales: " + inventory);

        // 3. New shipment arrives, increase quantity
        increaseQuantity(inventory, "Laptop", 5);
        System.out.println("After Shipment: " + inventory);

        // 4. Query remaining quantity
        queryQuantity(inventory, "Laptop");
        queryQuantity(inventory, "Monitor");

        // Print all products that are out of stock (quantity <= 0 or removed)
        System.out.println("\nOut of stock products (Removed from map): Mouse");
    }

    public static void reduceQuantity(Map<String, Integer> inventory, String product, int amount) {
        inventory.computeIfPresent(product, (k, v) -> {
            int newQuantity = v - amount;
            if (newQuantity <= 0) {
                System.out.println(product + " out of stock, removing from inventory list.");
                return null;
            }
            return newQuantity;
        });
    }

    public static void increaseQuantity(Map<String, Integer> inventory, String product, int amount) {
        inventory.merge(product, amount, Integer::sum);
    }

    public static void queryQuantity(Map<String, Integer> inventory, String product) {
        Integer quantity = inventory.get(product);
        if (quantity != null) {
            System.out.println(product + " remaining: " + quantity);
        } else {
            System.out.println(product + " is not stocked or is out of stock.");
        }
    }
}
