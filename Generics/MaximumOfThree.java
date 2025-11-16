public class MaximumOfThree {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of (3, 7, 1) is: " + maximum(3, 7, 1));
        System.out.println("Max of (10.5, 4.2, 8.9) is: " + maximum(10.5, 4.2, 8.9));
        System.out.println("Max of ('Apple', 'Orange', 'Banana') is: " + maximum("Apple", "Orange", "Banana"));
    }
}
