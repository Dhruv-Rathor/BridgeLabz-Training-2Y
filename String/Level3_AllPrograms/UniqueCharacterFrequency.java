import java.util.Scanner;

public class UniqueCharacterFrequency {
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

    public static void findFrequency(String text) {
        String unique = findUnique(text);
        for (int i = 0; i < unique.length(); i++) {
            char c = unique.charAt(i);
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) count++;
            }
            System.out.println(c + " : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        findFrequency(text);
    }
}
