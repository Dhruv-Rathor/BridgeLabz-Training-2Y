import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PolicyManagementSystem {
    
    private Set<Policy> quickLookupSet = new HashSet<>();
    private Set<Policy> insertionOrderSet = new LinkedHashSet<>();
    private Set<Policy> sortedByExpirySet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        System.out.println("Adding: " + policy.getPolicyNumber());
        boolean addedToHash = quickLookupSet.add(policy);
        insertionOrderSet.add(policy);
        sortedByExpirySet.add(policy);
        
        if (!addedToHash) {
            System.out.println("Duplicate policy detected: " + policy.getPolicyNumber());
        }
    }
    
    public void displayAllUnique() {
        System.out.println("\n--- All Unique (HashSet) ---");
        quickLookupSet.forEach(System.out::println);
    }
    
    public void displayInsertionOrder() {
        System.out.println("\n--- Insertion Order (LinkedHashSet) ---");
        insertionOrderSet.forEach(System.out::println);
    }

    public void displaySortedByExpiry() {
        System.out.println("\n--- Sorted by Expiry (TreeSet) ---");
        sortedByExpirySet.forEach(System.out::println);
    }

    public void displayExpiringSoon(LocalDate today) {
        System.out.println("\n--- Expiring Soon (within 30 days of " + today + ") ---");
        LocalDate thirtyDaysFromNow = today.plusDays(30);
        sortedByExpirySet.stream()
            .filter(p -> !p.getExpiryDate().isBefore(today) && p.getExpiryDate().isBefore(thirtyDaysFromNow))
            .forEach(System.out::println);
    }
    
    public void displayByCoverageType(String coverageType) {
        System.out.println("\n--- Coverage Type: " + coverageType + " ---");
        quickLookupSet.stream()
            .filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
            .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PolicyManagementSystem system = new PolicyManagementSystem();
        LocalDate today = LocalDate.now();

        Policy p1 = new Policy("A100", "Dhruv", today.plusDays(60), "Auto", 500);
        Policy p2 = new Policy("H200", "Alice", today.plusDays(25), "Health", 1200);
        Policy p3 = new Policy("HO300", "Bob", today.plusDays(10), "Home", 800);
        Policy p4 = new Policy("A101", "Charlie", today.plusDays(90), "Auto", 550);
        Policy p5 = new Policy("H200", "Alice B", today.plusDays(40), "Health", 1250);

        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);
        system.addPolicy(p5);

        system.displayInsertionOrder();
        system.displaySortedByExpiry();
        system.displayExpiringSoon(today);
        system.displayByCoverageType("Auto");
    }
}
