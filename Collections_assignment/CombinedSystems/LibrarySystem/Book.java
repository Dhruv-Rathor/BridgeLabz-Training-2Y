public class Book {
    String isbn; String title;
    public Book(String i, String t) { this.isbn = i; this.title = t; }
    @Override public String toString() { return "Book(" + title + ")"; }
}
