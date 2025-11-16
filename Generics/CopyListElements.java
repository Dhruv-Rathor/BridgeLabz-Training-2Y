import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyListElements {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> sourceList = Arrays.asList(1, 2, 3);
        List<Object> destinationList = new ArrayList<>();

        copyList(destinationList, sourceList);

        System.out.println("Source List: " + sourceList);
        System.out.println("Destination List after copy: " + destinationList);

        List<Number> numList = new ArrayList<>();
        List<Double> doubleSource = Arrays.asList(4.5, 6.7);
        copyList(numList, doubleSource);
        System.out.println("Number List after second copy: " + numList);
    }
}
