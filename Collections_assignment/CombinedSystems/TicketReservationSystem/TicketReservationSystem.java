import java.util.*;
public class TicketReservationSystem {
    public static void main(String[] args) {
        List<Booking> allBookings = new ArrayList<>();
        Set<String> registeredUsers = new HashSet<>(Arrays.asList("user1", "user2", "vip1"));
        Queue<Booking> normalQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();
        
        vipQueue.add(new Booking("vip1", 10));
        normalQueue.add(new Booking("user1", 1));
        vipQueue.add(new Booking("user2", 1));
        
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.remove();
            allBookings.add(b);
            System.out.println("Confirmed VIP/Priority: " + b);
        }
        
        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.remove();
            allBookings.add(b);
            System.out.println("Confirmed Normal: " + b);
        }
        
        System.out.println("All Confirmed: " + allBookings);
    }
}
