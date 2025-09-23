class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Author: " + name + ", Bio: " + bio);
        super.displayBookInfo();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author authorBook = new Author("The Hobbit", 1937, "J.R.R. Tolkien", "English writer and philologist.");
        authorBook.displayInfo();
    }
}
