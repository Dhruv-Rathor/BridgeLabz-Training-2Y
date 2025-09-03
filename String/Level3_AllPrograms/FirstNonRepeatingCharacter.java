import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '_';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char res = findFirstNonRepeating(text);
        if (res == '_') System.out.println("No non-repeating character found.");
        else System.out.println("First non-repeating character: " + res);
    }
}
