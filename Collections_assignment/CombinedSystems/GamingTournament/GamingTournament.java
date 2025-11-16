import java.util.*;
public class GamingTournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Player p1 = new Player("Ryu");
        Player p2 = new Player("Ken");
        players.add(p1); players.add(p2);
        
        Queue<Match> schedule = new LinkedList<>();
        schedule.add(new Match(p1, p2));
        
        List<Result> results = new ArrayList<>();
        TreeSet<Score> leaderboard = new TreeSet<>();
        
        Match match = schedule.remove();
        results.add(new Result(match, p1));
        
        leaderboard.add(new Score(p1, 100));
        leaderboard.add(new Score(p2, 50));
        
        System.out.println("Registered: " + players);
        System.out.println("Results: " + results);
        System.out.println("Leaderboard: " + leaderboard);
    }
}
