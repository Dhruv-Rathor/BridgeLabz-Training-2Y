import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> input = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Input: " + input);

        List<Integer> sortedList = new ArrayList<>(input);
        Collections.sort(sortedList);
        
        System.out.println("Output: " + sortedList);
    }
}
