import java.util.List;
import java.util.ArrayList;

abstract class Vehicle {
    String id;
    public Vehicle(String id) { this.id = id; }
    public String toString() { return "Vehicle ID: " + id; }
}

class Truck extends Vehicle {
    public Truck(String id) { super(id); }
    public String toString() { return "Truck ID: " + id; }
}

class Bike extends Vehicle {
    public Bike(String id) { super(id); }
    public String toString() { return "Bike ID: " + id; }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
        System.out.println("Added to fleet: " + vehicle);
    }

    public void showFleet() {
        System.out.println("--- Current Fleet ---");
        for (T vehicle : fleet) {
            System.out.println(vehicle);
        }
    }
}

public class GenericFleetManager {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("T-100"));
        truckFleet.addVehicle(new Truck("T-200"));
        truckFleet.showFleet();

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("B-001"));
        bikeFleet.showFleet();
    }
}
