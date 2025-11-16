import java.util.*;
public class CourierSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> assignedIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        
        priorityQueue.add(new Parcel("P1", 10));
        normalQueue.add(new Parcel("P2", 1));
        priorityQueue.add(new Parcel("P3", 5));
        
        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.remove();
            System.out.println("Delivering high priority: " + p);
            assignedIds.add(p.id);
            completed.add(p);
        }
        
        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.remove();
            System.out.println("Delivering normal: " + p);
            assignedIds.add(p.id);
            completed.add(p);
        }
        
        System.out.println("Completed: " + completed);
    }
}
