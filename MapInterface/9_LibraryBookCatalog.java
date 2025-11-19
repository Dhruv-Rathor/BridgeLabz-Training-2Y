import java.util.Map;
import java.util.TreeMap;

public class LibraryBookCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>();

        // 1. Add several books
        catalog.put("978-1234567890", "The Great Novel");
        catalog.put("978-0000000001", "Introduction to Java");
        catalog.put("978-9999999999", "Data Structures Guide");
        catalog.put("978-5555555555", "Advanced Algorithms");

        // 2. Search by ISBN
        searchByISBN(catalog, "978-0000000001");
        searchByISBN(catalog, "978-1111111111");

        // 3. Remove books
        catalog.remove("978-9999999999");
        System.out.println("\nAfter removing 'Data Structures Guide': " + catalog);

        // 4. Print all ISBNs + titles sorted by ISBN (TreeMap handles sorting)
        System.out.println("\nCatalog Sorted by ISBN:");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + ", Title: " + entry.getValue());
        }

        // Extension: Search by title
        System.out.println("\nSearch by Title:");
        searchByTitle(catalog, "Introduction to Java");
        searchByTitle(catalog, "Non-existent Book");
    }

    public static void searchByISBN(Map<String, String> catalog, String isbn) {
        String title = catalog.get(isbn);
        if (title != null) {
            System.out.println("Book found (ISBN: " + isbn + "): " + title);
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    public static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found book '" + title + "' with ISBN: " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }
}
