import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateList {

    public static <T> void rotate(List<T> list, int positions) {
        if (list == null || list.isEmpty() || positions < 0) {
            return;
        }
        int size = list.size();
        positions = positions % size;
        if (positions == 0) {
            return;
        }
        
        List<T> temp = new ArrayList<>(list.subList(0, positions));
        for (int i = 0; i < size - positions; i++) {
            list.set(i, list.get(i + positions));
        }
        for (int i = 0; i < temp.size(); i++) {
            list.set(size - positions + i, temp.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Input: " + list + ", rotate by " + rotateBy);
        rotate(list, rotateBy);
        System.out.println("Output: " + list);
    }
}
