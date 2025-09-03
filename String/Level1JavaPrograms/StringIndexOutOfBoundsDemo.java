import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        // generateException(text);
        handleException(text);
        sc.close();
    }
}