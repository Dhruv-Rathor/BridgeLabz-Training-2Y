public class CustomHashMap {
    private class Node {
        int key;
        int value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int capacity = 16;

    public CustomHashMap() {
        buckets = new Node[capacity];
    }

    private int getBucketIndex(int key) {
        return Math.abs(Integer.hashCode(key)) % capacity;
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        Node head = buckets[index];
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public int get(int key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];
        Node prev = null;
        while (head != null) {
            if (head.key == key) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets[index] = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
