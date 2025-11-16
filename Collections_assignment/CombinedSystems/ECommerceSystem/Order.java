import java.util.Objects;
public class Order {
    int orderId; String customerName;
    public Order(int id, String name) { this.orderId = id; this.customerName = name; }
    @Override public String toString() { return "Order{" + orderId + ", " + customerName + "}"; }
    @Override public boolean equals(Object o) { if (this == o) return true; if (o == null || getClass() != o.getClass()) return false; Order order = (Order) o; return orderId == order.orderId; }
    @Override public int hashCode() { return Objects.hash(orderId); }
}
