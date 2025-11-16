import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class GenerateBinaryNumbers {

    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.add("1");
        
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);
            
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("N=" + n);
        List<String> output = generateBinary(n);
        System.out.println("Output: " + output);
    }
}
