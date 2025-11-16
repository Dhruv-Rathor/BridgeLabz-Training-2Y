import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class ReverseList {

    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static <T> List<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversed = new LinkedList<>();
        for (T element : list) {
            reversed.addFirst(element);
        }
        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        List<Integer> reversedArrayList = reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + linkedList);
        List<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}
