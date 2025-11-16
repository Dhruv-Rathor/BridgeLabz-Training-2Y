import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class ElementFrequency {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Input: " + input);
        Map<String, Integer> output = countFrequency(input);
        System.out.println("Output: " + output);
    }
}
