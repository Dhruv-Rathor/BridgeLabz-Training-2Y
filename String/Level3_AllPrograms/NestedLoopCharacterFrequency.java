import java.util.Scanner;

public class NestedLoopCharacterFrequency {
    public static void findFrequency(String text) {
        char[] chars = text.toCharArray();
        boolean[] visited = new boolean[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(chars[i] + " : " + count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        findFrequency(text);
    }
}
