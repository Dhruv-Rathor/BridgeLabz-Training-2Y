import java.util.Arrays;

public class CircularBuffer<T> {
    private T[] buffer;
    private int size;
    private int head = 0;
    private int tail = 0;
    private int currentSize = 0;

    @SuppressWarnings("unchecked")
    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = (T[]) new Object[size];
    }

    public void insert(T element) {
        if (currentSize == size) {
            head = (head + 1) % size;
            currentSize--;
        }
        buffer[tail] = element;
        tail = (tail + 1) % size;
        currentSize++;
    }

    public T remove() {
        if (currentSize == 0) {
            return null;
        }
        T element = buffer[head];
        buffer[head] = null;
        head = (head + 1) % size;
        currentSize--;
        return element;
    }

    public void display() {
        System.out.println(Arrays.toString(buffer));
    }

    public static void main(String[] args) {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.display();
        
        buffer.insert(4);
        buffer.display();
        
        buffer.insert(5);
        buffer.display();
    }
}
