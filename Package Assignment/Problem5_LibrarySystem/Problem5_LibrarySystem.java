class Book {
    private String title;
    public Book(String title) {
        this.title = title;
        System.out.println("Book Added: " + title);
    }
    public String getTitle() {
        return title;
    }
}

class Member {
    private String name;
    public Member(String name) {
        this.name = name;
        System.out.println("Member Registered: " + name);
    }
    public String getName() {
        return name;
    }
}

class Transaction {
    public void issueBook(Book b, Member m) {
        System.out.println("Issuing '" + b.getTitle() + "' to " + m.getName());
    }
}

public class Problem5_LibrarySystem {
    public static void main(String[] args) {
        Book newBook = new Book("Java Basics");
        Member newMember = new Member("Priya");
        Transaction tx = new Transaction();

        tx.issueBook(newBook, newMember);
    }
}
