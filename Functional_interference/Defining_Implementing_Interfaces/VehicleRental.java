interface Rentable {
    void rent();
    void returnVehicle();
}
class Car implements Rentable {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}
public class VehicleRental {
    public static void main(String[] args) {
        Rentable car = new Car();
        car.rent();
        car.returnVehicle();
    }
}
