interface Device {
    void turnOn();
    void turnOff();
}
class Light implements Device {
    public void turnOn() { System.out.println("Light turned on"); }
    public void turnOff() { System.out.println("Light turned off"); }
}
class TV implements Device {
    public void turnOn() { System.out.println("TV turned on"); }
    public void turnOff() { System.out.println("TV turned off"); }
}
public class DeviceControl {
    public static void main(String[] args) {
        Device light = new Light();
        light.turnOn();
        light.turnOff();
    }
}
