import java.util.List;
import java.util.ArrayList;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public String toString() { return "Item: " + name; }
}

class ElectronicsItem extends WarehouseItem {
    public ElectronicsItem(String name) { super(name); }
    public String toString() { return "Electronics: " + name; }
}

class GroceriesItem extends WarehouseItem {
    public GroceriesItem(String name) { super(name); }
    public String toString() { return "Grocery: " + name; }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouse {

    public static void displayAllItems(List<? extends WarehouseItem> items) {
        System.out.println("--- All Warehouse Items ---");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Storage<ElectronicsItem> electronicStorage = new Storage<>();
        electronicStorage.addItem(new ElectronicsItem("TV"));
        electronicStorage.addItem(new ElectronicsItem("Radio"));

        Storage<GroceriesItem> groceryStorage = new Storage<>();
        groceryStorage.addItem(new GroceriesItem("Apple"));
        groceryStorage.addItem(new GroceriesItem("Milk"));
        
        displayAllItems(electronicStorage.getItems());
        displayAllItems(groceryStorage.getItems());
    }
}
