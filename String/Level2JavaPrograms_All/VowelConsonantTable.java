import java.util.Scanner;

public class VowelConsonantTable {
    public static String checkType(char c) {
        c=Character.toLowerCase(c);
        if (c>='a' && c<='z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyze(String s) {
        String[][] arr=new String[s.length()][2];
        for (int i=0;i<s.length();i++) {
            arr[i][0]=String.valueOf(s.charAt(i));
            arr[i][1]=checkType(s.charAt(i));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        String[][] res=analyze(text);
        System.out.println("Char\tType");
        for (String[] row:res) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}