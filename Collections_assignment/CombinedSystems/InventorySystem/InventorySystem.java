import java.util.*;
public class InventorySystem {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>(Arrays.asList("Apple", "Banana"));
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(new Product("Apple", 5));
        allProducts.add(new Product("Banana", 15));
        
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockedHistory = new Stack<>();
        
        for (Product p : allProducts) {
            if (p.stock < 10) {
                restockQueue.add(p);
            }
        }
        System.out.println("Needs Restock: " + restockQueue);
        
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.remove();
            p.stock += 50;
            System.out.println("Restocked: " + p);
            restockedHistory.push(p);
        }
        
        System.out.println("Undo last restock: " + restockedHistory.pop());
    }
}
