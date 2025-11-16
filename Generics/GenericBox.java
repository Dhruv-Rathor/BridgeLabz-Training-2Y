public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(10);
        System.out.println("Integer Value: " + intBox.get());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello Generics");
        System.out.println("String Value: " + stringBox.get());

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(123.45);
        System.out.println("Double Value: " + doubleBox.get());
    }
}
