interface PaymentProcessor {
    void process(double amount);
    default void refund(double amount) {
        System.out.println("Refunded: " + amount);
    }
}
class PayPal implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processed: " + amount);
    }
}
public class PaymentIntegration {
    public static void main(String[] args) {
        PaymentProcessor p = new PayPal();
        p.process(200);
        p.refund(50);
    }
}
