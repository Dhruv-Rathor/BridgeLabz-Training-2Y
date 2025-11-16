import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicatesOrdered {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        System.out.println("Input: " + input);
        List<Integer> output = removeDuplicates(input);
        System.out.println("Output: " + output);
    }
}
