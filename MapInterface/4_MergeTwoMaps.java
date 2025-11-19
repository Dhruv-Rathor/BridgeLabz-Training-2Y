import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        map2.put("D", 5);

        Map<String, Integer> mergedMap = new HashMap<>(map1);

        map2.forEach((key, value) -> mergedMap.merge(key, value, Integer::sum));

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged Map: " + mergedMap);
    }
}
