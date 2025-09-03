import java.util.Scanner;

public class WordLengthTable {
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

    public static String[][] wordLengthArray(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] res = wordLengthArray(words);
        System.out.println("Word\tLength");
        for (String[] row : res) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}