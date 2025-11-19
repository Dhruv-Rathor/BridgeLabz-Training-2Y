import java.util.HashMap;
import java.util.Map;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] allVotes = {
            "Candidate A", "Candidate B", "Candidate C", "Candidate A",
            "Candidate A", "Candidate B", "Candidate C", "Candidate A",
            "Candidate D", "Candidate A"
        }; // 10 votes

        for (String candidate : allVotes) {
            votes.merge(candidate, 1, Integer::sum);
        }

        System.out.println("Total Votes per Candidate:");
        System.out.println(votes);

        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nElection Winner: " + winner + " with " + maxVotes + " votes.");
    }
}
