import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static String computerChoice() {
        String[] choices={"rock","paper","scissors"};
        Random r=new Random();
        return choices[r.nextInt(3)];
    }

    public static int winner(String user,String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock")&&comp.equals("scissors"))||
            (user.equals("paper")&&comp.equals("rock"))||
            (user.equals("scissors")&&comp.equals("paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n=sc.nextInt();
        int userWins=0, compWins=0;
        for (int i=0;i<n;i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user=sc.next().toLowerCase();
            String comp=computerChoice();
            int res=winner(user,comp);
            if (res==1) userWins++; else if (res==-1) compWins++;
            System.out.println("Game "+(i+1)+": User="+user+", Computer="+comp);
        }
        System.out.println("User wins: "+userWins);
        System.out.println("Computer wins: "+compWins);
        double userPct=(userWins*100.0)/n;
        double compPct=(compWins*100.0)/n;
        System.out.println("User win%: "+userPct);
        System.out.println("Computer win%: "+compPct);
    }
}