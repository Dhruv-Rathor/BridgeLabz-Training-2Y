import java.util.Scanner;

public class StringLengthCheck {
    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int len1 = getLength(text);
        int len2 = text.length();
        System.out.println("Length without length(): " + len1);
        System.out.println("Length with length(): " + len2);
    }
}