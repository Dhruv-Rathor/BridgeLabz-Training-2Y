import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        List<String> upperNames = names.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
                                        
        System.out.println("Uppercase names:");
        upperNames.forEach(System.out::println);
    }
}
