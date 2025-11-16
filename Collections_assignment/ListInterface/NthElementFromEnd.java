import java.util.LinkedList;

public class NthElementFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n < 1 || list.size() < n) {
            return null;
        }
        
        java.util.Iterator<T> fast = list.iterator();
        java.util.Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                return null;
            }
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int n = 2;
        
        System.out.println("Input: " + list + ", N=" + n);
        String output = findNthFromEnd(list, n);
        System.out.println("Output: " + output);
    }
}
