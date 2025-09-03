import java.util.Scanner;

public class SplitString {
    public static String[] splitWords(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = s.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] arr1 = splitWords(text);
        String[] arr2 = text.split(" ");
        boolean same = compareArrays(arr1, arr2);
        System.out.println("Equal arrays: " + same);
    }
}