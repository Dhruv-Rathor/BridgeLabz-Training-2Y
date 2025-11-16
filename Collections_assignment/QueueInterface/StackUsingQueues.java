import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueues<T> {
    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();
    private T top;

    public void push(T value) {
        q1.add(value);
        top = value;
    }

    public T pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        T valueToPop = q1.remove();
        Queue<T> temp = q1;
        q1 = q2;
        q2 = temp;
        return valueToPop;
    }

    public T top() {
        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues<Integer> stack = new StackUsingQueues<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
    }
}
