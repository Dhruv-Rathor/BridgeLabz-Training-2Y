import java.util.HashMap;
import java.util.Map;

public class ExamResultsTopper {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> results = new HashMap<>();

        // 1. Add multiple subjects and marks for each student
        Map<String, Integer> mathScores = new HashMap<>();
        mathScores.put("Alice", 85);
        mathScores.put("Bob", 92);
        mathScores.put("Charlie", 78);

        Map<String, Integer> physicsScores = new HashMap<>();
        physicsScores.put("Alice", 95);
        physicsScores.put("Bob", 88);
        physicsScores.put("Charlie", 95);

        Map<String, Integer> historyScores = new HashMap<>();
        historyScores.put("Alice", 70);
        historyScores.put("Bob", 80);
        historyScores.put("Charlie", 98);

        results.put("Math", mathScores);
        results.put("Physics", physicsScores);
        results.put("History", historyScores);

        // 2. Find the top scorer per subject
        System.out.println("Top Scorer Per Subject:");
        results.forEach((subject, scores) -> {
            String topper = findTopper(scores);
            System.out.println(subject + ": " + topper + " (" + scores.get(topper) + ")");
        });

        // 3. Print the average score per subject
        System.out.println("\nAverage Score Per Subject:");
        results.forEach((subject, scores) -> {
            double avg = calculateAverage(scores);
            System.out.printf("%s: %.2f%n", subject, avg);
        });

        // 4. List subjects where at least one student scored above 90
        System.out.println("\nSubjects with at least one score > 90:");
        results.forEach((subject, scores) -> {
            if (scores.values().stream().anyMatch(score -> score > 90)) {
                System.out.println("- " + subject);
            }
        });
    }

    public static String findTopper(Map<String, Integer> scores) {
        String topper = null;
        int maxScore = -1;
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                topper = entry.getKey();
            }
        }
        return topper;
    }

    public static double calculateAverage(Map<String, Integer> scores) {
        int totalScore = scores.values().stream().mapToInt(Integer::intValue).sum();
        return (double) totalScore / scores.size();
    }
}
