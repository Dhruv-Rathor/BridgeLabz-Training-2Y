import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);
        
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        
        symmetricDiff.removeAll(intersection);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Output: " + symmetricDiff);
    }
}
