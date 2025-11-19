import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String, Integer> visitCounts = new HashMap<>();

        String[] visits = {
            "home", "about", "products", "home", "products", "contact", "home", "products", "about"
        };

        // 1. When a page is visited, update the count
        for (String page : visits) {
            visitCounts.merge(page, 1, Integer::sum);
        }

        System.out.println("Raw Visit Counts: " + visitCounts);

        // 3. Print the page with the most visits
        String topPage = visitCounts.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("No visits recorded");
        System.out.println("\nPage with the Most Visits: " + topPage);


        // 2. At session end, print list of pages sorted by descending visit count
        Map<String, Integer> sortedVisits = visitCounts.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, java.util.LinkedHashMap::new
            ));

        System.out.println("\nPages Sorted by Descending Visit Count:");
        sortedVisits.forEach((page, count) -> System.out.println(page + ": " + count));
    }
}
