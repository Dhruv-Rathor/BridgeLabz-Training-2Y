import java.util.function.Function;
public class StringLengthCheck {
    public static void main(String[] args) {
        Function<String, Integer> lengthCheck = s -> s.length();
        String msg = "Hello Java";
        System.out.println("Length: " + lengthCheck.apply(msg));
    }
}
