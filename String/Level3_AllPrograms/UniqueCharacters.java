import java.util.Scanner;

public class UniqueCharacters {
    public static String findUnique(String text) {
        char[] chars = text.toCharArray();
        String unique = "";
        for (int i = 0; i < chars.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique += chars[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String unique = findUnique(text);
        System.out.println("Unique characters: " + unique);
    }
}
