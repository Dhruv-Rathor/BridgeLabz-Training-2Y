import java.util.ArrayList;
import java.util.List;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    protected double ratePerKm;
    public RideVehicle(double rate) { this.ratePerKm = rate; }
    public abstract double calculateFare(double distance);
}

class RideCar extends RideVehicle implements GPS {
    public RideCar(double rate) { super(rate); }
    @Override public double calculateFare(double dist) { return dist * ratePerKm + 5; }
    @Override public String getCurrentLocation() { return "123 Main St"; }
    @Override public void updateLocation(String loc) { System.out.println("Car location updated."); }
}

class RideBike extends RideVehicle {
    public RideBike(double rate) { super(rate); }
    @Override public double calculateFare(double dist) { return dist * ratePerKm; }
}

class Auto extends RideVehicle {
    public Auto(double rate) { super(rate); }
    @Override public double calculateFare(double dist) { return dist * ratePerKm + 2; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<RideVehicle> vehicles = new ArrayList<>();
        vehicles.add(new RideCar(1.5));
        vehicles.add(new RideBike(0.8));
        vehicles.add(new Auto(1.2));
        
        double distance = 10;
        for (RideVehicle v : vehicles) {
            System.out.println("Fare for " + distance + " km: $" + v.calculateFare(distance));
        }
    }
}
