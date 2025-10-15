interface Payment {
    void pay(double amount);
}
class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI"); }
}
public class DigitalPayment {
    public static void main(String[] args) {
        Payment upi = new UPI();
        upi.pay(250);
    }
}
