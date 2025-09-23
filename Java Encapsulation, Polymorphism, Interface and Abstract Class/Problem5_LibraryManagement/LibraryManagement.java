import java.util.ArrayList;
import java.util.List;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String title;
    public LibraryItem(String title) { this.title = title; }
    public abstract int getLoanDuration();
    public String getTitle() { return title; }
    public void getItemDetails() { System.out.println("Title: " + title); }
}

class Book extends LibraryItem implements Reservable {
    public Book(String title) { super(title); }
    @Override public int getLoanDuration() { return 21; }
    @Override public void reserveItem() { System.out.println(getTitle() + " reserved."); }
    @Override public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem {
    public Magazine(String title) { super(title); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String title) { super(title); }
    @Override public int getLoanDuration() { return 3; }
}

public class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("The Great Gatsby"));
        items.add(new Magazine("National Geographic"));
        items.add(new DVD("Inception"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
