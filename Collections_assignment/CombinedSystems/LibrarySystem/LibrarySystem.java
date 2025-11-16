import java.util.*;
public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> catalog = new ArrayList<>();
        Book b1 = new Book("111", "Java");
        Book b2 = new Book("222", "SQL");
        catalog.add(b1);
        catalog.add(b2);
        
        Set<String> memberIds = new HashSet<>(Arrays.asList("M1", "M2"));
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();
        
        issueQueue.add(b1);
        System.out.println("Issuing: " + issueQueue.remove());
        
        returnedStack.push(b1);
        System.out.println("Returned: " + b1);
        
        System.out.println("Re-issue last returned: " + returnedStack.pop());
    }
}
