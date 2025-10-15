import java.util.function.Predicate;
public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 40;
        double temp = 42;
        if (alert.test(temp))
            System.out.println("High Temperature Alert!");
    }
}
