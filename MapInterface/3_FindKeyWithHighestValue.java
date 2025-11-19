import java.util.HashMap;
import java.util.Map;

public class FindKeyWithHighestValue {
    public static void main(String[] args) {
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 15);
        dataMap.put("D", 25);
        dataMap.put("E", 5);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Map: " + dataMap);
        System.out.println("Key with the Highest Value: " + maxKey + " (Value: " + maxValue + ")");
    }
}
