import java.util.*;
public class RideSharingSystem {
    public static void main(String[] args) {
        PriorityQueue<RideRequest> highPriorityQueue = new PriorityQueue<>(
            (r1, r2) -> Integer.compare(r2.priority, r1.priority)
        );
        highPriorityQueue.add(new RideRequest("Alice", 5));
        highPriorityQueue.add(new RideRequest("Bob", 1));
        highPriorityQueue.add(new RideRequest("Charlie", 10));
        
        Set<Driver> availableDrivers = new HashSet<>(Arrays.asList(new Driver("D1"), new Driver("D2")));
        List<Ride> completedRides = new ArrayList<>();

        while (!highPriorityQueue.isEmpty() && !availableDrivers.isEmpty()) {
            RideRequest request = highPriorityQueue.remove();
            Driver driver = availableDrivers.iterator().next();
            availableDrivers.remove(driver);
            
            Ride ride = new Ride(request.user, driver.driverId);
            completedRides.add(ride);
            System.out.println("Assigned: " + ride);
        }
        System.out.println("Completed Rides: " + completedRides);
    }
}
