import java.util.Scanner;

public class CharArrayComparison {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] arr1 = customToCharArray(text);
        char[] arr2 = text.toCharArray();
        System.out.println(compareArrays(arr1, arr2));
        sc.close();
    }
}