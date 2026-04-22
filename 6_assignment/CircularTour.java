public class CircularTour {
    public static int printTour(int[] petrol, int[] distance) {
        int start = 0;
        int deficit = 0;
        int capacity = 0;

        for (int i = 0; i < petrol.length; i++) {
            capacity += petrol[i] - distance[i];
            if (capacity < 0) {
                start = i + 1;
                deficit += capacity;
                capacity = 0;
            }
        }
        return (capacity + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int start = printTour(petrol, distance);
        System.out.println(start == -1 ? "No Solution" : "Start at pump: " + start);
    }
}
