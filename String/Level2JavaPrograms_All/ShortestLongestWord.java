import java.util.Scanner;

public class ShortestLongestWord {
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }
        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}