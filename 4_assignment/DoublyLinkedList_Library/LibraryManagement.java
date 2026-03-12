
class Book {

    int id;

    String title;

    Book next, prev;



    Book(int id, String title) {

        this.id = id;

        this.title = title;

    }

}



public class LibraryManagement {

    private Book head, tail;



    public void addBook(int id, String title) {

        Book newNode = new Book(id, title);

        if (head == null) {

            head = tail = newNode;

        } else {

            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

        }

    }



    public void displayReverse() {

        Book temp = tail;

        while (temp != null) {

            System.out.println(temp.title);

            temp = temp.prev;

        }

    }



    public static void main(String[] args) {

        LibraryManagement lib = new LibraryManagement();

        lib.addBook(1, "Java Basics");

        lib.addBook(2, "Data Structures");

        lib.displayReverse();

    }

}

