import java.util.*;
public class WarehouseSystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> uniqueIds = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();
        
        pending.add(new Package("P101", "NYC"));
        pending.add(new Package("P102", "LA"));
        pending.add(new Package("P103", "MIA"));
        
        uniqueIds.add("P101");
        uniqueIds.add("P102");
        uniqueIds.add("P103");
        
        Package p1 = pending.remove();
        delivered.add(p1);
        System.out.println("Delivered: " + p1);
        
        Package p2 = pending.remove();
        returned.push(p2);
        System.out.println("Returned: " + p2);
        
        System.out.println("Delivered Summary: " + delivered);
        System.out.println("Returned Summary: " + returned);
    }
}
