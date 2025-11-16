import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class PerformanceComparison {

    private static final int NUM_POLICIES = 50000;

    public static void main(String[] args) {
        List<Policy> policies = new ArrayList<>();
        for (int i = 0; i < NUM_POLICIES; i++) {
            policies.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i % 365), "Type" + (i % 5), 100 + i));
        }
        Policy searchPolicy = new Policy("P" + (NUM_POLICIES / 2), "", null, "", 0);

        testPerformance(new HashSet<>(), policies, searchPolicy, "HashSet");
        testPerformance(new LinkedHashSet<>(), policies, searchPolicy, "LinkedHashSet");
        testPerformance(new TreeSet<>(), policies, searchPolicy, "TreeSet");
    }

    private static void testPerformance(Set<Policy> set, List<Policy> policies, Policy searchPolicy, String type) {
        System.out.println("\n--- Testing " + type + " ---");
        
        long start = System.nanoTime();
        for (Policy p : policies) {
            set.add(p);
        }
        long end = System.nanoTime();
        System.out.println("Add time: " + (end - start) / 1_000_000.0 + " ms");
        
        start = System.nanoTime();
        boolean found = set.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("Search time: " + (end - start) / 1_000_000.0 + " ms (Found: " + found + ")");

        start = System.nanoTime();
        boolean removed = set.remove(searchPolicy);
        end = System.nanoTime();
        System.out.println("Remove time: " + (end - start) / 1_000_000.0 + " ms (Removed: " + removed + ")");
    }
}
