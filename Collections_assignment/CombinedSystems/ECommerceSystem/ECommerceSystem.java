import java.util.*;
public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Alice"));
        allOrders.add(new Order(102, "Bob"));
        allOrders.add(new Order(101, "Alice"));
        
        Set<Order> uniqueOrders = new HashSet<>(allOrders);
        System.out.println("Unique orders: " + uniqueOrders);
        
        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();
        
        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.remove();
            if (order.orderId == 102) {
                System.out.println("Failing: " + order);
                failedOrders.push(order);
            } else {
                System.out.println("Processing: " + order);
            }
        }
        
        System.out.println("Retrying failed orders:");
        while (!failedOrders.isEmpty()) {
            System.out.println("Retrying: " + failedOrders.pop());
        }
    }
}
