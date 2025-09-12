package com.bridgelabz.oops.level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public void display() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 55000);
        item.display();
        System.out.println("Total Cost for 2 items: " + item.totalCost(2));
    }
}