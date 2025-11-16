public class GenericPair<T, U> {
    private T first;
    private U second;

    public GenericPair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> student = new GenericPair<>("Amol", 20);
        System.out.println("Student Name: " + student.getFirst());
        System.out.println("Student Age: " + student.getSecond());

        GenericPair<Integer, String> item = new GenericPair<>(101, "Laptop");
        System.out.println("Item ID: " + item.getFirst());
        System.out.println("Item Name: " + item.getSecond());
    }
}
