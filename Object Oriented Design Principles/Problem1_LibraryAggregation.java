import java.util.ArrayList;
import java.util.List;

class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in " + this.name + ":");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }
}

public class Problem1_LibraryAggregation {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");

        Library mainLibrary = new Library("City Central Library");
        mainLibrary.addBook(book1);
        mainLibrary.addBook(book2);

        mainLibrary.showBooks();
        
        System.out.println(book1.title + " still exists independently.");
    }
}
