import java.util.*;
public class SportsTournamentScheduler {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team("Eagles", 0);
        Team t2 = new Team("Tigers", 0);
        Team t3 = new Team("Lions", 0);
        teams.add(t1); teams.add(t2); teams.add(t3);
        System.out.println("Registered Teams: " + teams);

        Queue<Match> schedule = new LinkedList<>();
        schedule.add(new Match(t1, t2));
        schedule.add(new Match(t2, t3));
        
        List<Result> results = new ArrayList<>();
        TreeSet<Team> leaderboard = new TreeSet<>();
        
        Match m1 = schedule.remove();
        t1.points += 3;
        results.add(new Result(m1, "Eagles"));
        
        Match m2 = schedule.remove();
        t2.points += 3;
        results.add(new Result(m2, "Tigers"));
        
        leaderboard.add(t1);
        leaderboard.add(t2);
        leaderboard.add(t3);
        
        System.out.println("Leaderboard: " + leaderboard);
    }
}
