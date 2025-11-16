public class Product {
    String name; int stock;
    public Product(String n, int s) { this.name = n; this.stock = s; }
    @Override public String toString() { return "Product(" + name + ", stock=" + stock + ")"; }
}
