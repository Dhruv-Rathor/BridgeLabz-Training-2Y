import java.util.Scanner;

public class TrimSpaces {
    public static String trimSpaces(String s) {
        int start=0,end=s.length()-1;
        while (start<=end && s.charAt(start)==' ') start++;
        while (end>=start && s.charAt(end)==' ') end--;
        StringBuilder sb=new StringBuilder();
        for (int i=start;i<=end;i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text=sc.nextLine();
        String trimmed=trimSpaces(text);
        String builtin=text.trim();
        System.out.println("Trimmed(custom): '"+trimmed+"'");
        System.out.println("Trimmed(builtin): '"+builtin+"'");
        System.out.println("Equal: "+trimmed.equals(builtin));
    }
}