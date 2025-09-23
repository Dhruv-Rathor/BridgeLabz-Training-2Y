import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String num, String type, double rate) { this.vehicleNumber = num; this.type = type; this.rentalRate = rate; }
    public abstract double calculateRentalCost(int days);
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override public double calculateInsurance() { return getRentalRate() * 0.1; }
    @Override public String getInsuranceDetails() { return "Comprehensive Car Insurance"; }
}

class Bike extends Vehicle {
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 0.9; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 1.2; }
    @Override public double calculateInsurance() { return getRentalRate() * 0.2; }
    @Override public String getInsuranceDetails() { return "Heavy Vehicle Insurance"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR01", 50));
        vehicles.add(new Bike("BIKE01", 20));
        vehicles.add(new Truck("TRUCK01", 100));
        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            double totalCost = v.calculateRentalCost(rentalDays);
            if (v instanceof Insurable) { totalCost += ((Insurable) v).calculateInsurance(); }
            System.out.println(v.getType() + " Total Cost for " + rentalDays + " days: $" + totalCost);
        }
    }
}
