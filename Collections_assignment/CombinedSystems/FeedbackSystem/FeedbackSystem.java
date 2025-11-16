import java.util.*;
public class FeedbackSystem {
    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        allFeedback.add("Great app!");
        allFeedback.add("Very slow.");
        allFeedback.add("Great app!");
        allFeedback.add("Love the new feature.");
        
        Set<String> uniqueFeedback = new LinkedHashSet<>(allFeedback);
        Queue<String> processingQueue = new LinkedList<>(uniqueFeedback);
        Stack<String> recentFeedback = new Stack<>();
        
        System.out.println("Processing in order:");
        while (!processingQueue.isEmpty()) {
            String feedback = processingQueue.remove();
            System.out.println("Processing: " + feedback);
            recentFeedback.push(feedback);
        }
        
        System.out.println("\nMost recent: " + recentFeedback.pop());
        System.out.println("Next recent: " + recentFeedback.pop());
    }
}
