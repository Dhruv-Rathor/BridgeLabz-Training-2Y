
class Item {

    int id;

    String name;

    int qty;

    double price;

    Item next;



    Item(int id, String name, int qty, double price) {

        this.id = id;

        this.name = name;

        this.qty = qty;

        this.price = price;

    }

}



public class InventoryManagement {

    private Item head = null;



    public void addItem(int id, String name, int qty, double price) {

        Item newNode = new Item(id, name, qty, price);

        newNode.next = head;

        head = newNode;

    }



    public double calculateTotalValue() {

        double total = 0;

        Item temp = head;

        while (temp != null) {

            total += (temp.price * temp.qty);

            temp = temp.next;

        }

        return total;

    }



    public static void main(String[] args) {

        InventoryManagement inv = new InventoryManagement();

        inv.addItem(1, "Laptop", 10, 1000);

        inv.addItem(2, "Mouse", 50, 20);

        System.out.println("Total Value: " + inv.calculateTotalValue());

    }

}

