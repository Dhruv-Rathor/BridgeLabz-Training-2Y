public class CompareValues {

    public static <T> boolean isEqual(T a, T b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null) {
            return false;
        }
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Are 10 and 10 equal? " + isEqual(10, 10));
        System.out.println("Are 'Hello' and 'World' equal? " + isEqual("Hello", "World"));
        System.out.println("Are 10 and 20 equal? " + isEqual(10, 20));
        System.out.println("Are 'Java' and 'Java' equal? " + isEqual("Java", "Java"));
    }
}
