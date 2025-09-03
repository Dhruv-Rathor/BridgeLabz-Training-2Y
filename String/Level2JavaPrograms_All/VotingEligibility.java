import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    public static int[] randomAges(int n) {
        Random r=new Random();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
        return arr;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] res=new String[ages.length][2];
        for (int i=0;i<ages.length;i++) {
            res[i][0]=String.valueOf(ages[i]);
            res[i][1]=(ages[i]>=18)?"true":"false";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[] ages=randomAges(n);
        String[][] res=checkEligibility(ages);
        System.out.println("Age\tCanVote");
        for (String[] row:res) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
}