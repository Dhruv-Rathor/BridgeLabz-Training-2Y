import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> allStudents = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        int totalDays = 15;
        int threshold = 10;

        // 1. Initialize the map with all students and zero days
        for (String student : allStudents) {
            attendance.put(student, 0);
        }

        // Simulate daily attendance (e.g., 15 days)
        List<List<String>> dailyPresentLists = Arrays.asList(
            Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"),
            Arrays.asList("Alice", "Charlie", "Eve"),
            Arrays.asList("Bob", "David", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"),
            Arrays.asList("Alice", "Charlie", "David"),
            Arrays.asList("Bob", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "David"),
            Arrays.asList("Charlie", "David", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"),
            Arrays.asList("Alice", "Charlie"),
            Arrays.asList("Bob", "David", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve"),
            Arrays.asList("Alice", "David"),
            Arrays.asList("Bob", "Charlie", "Eve"),
            Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve")
        );


        // 2. For each day, mark attendance
        for (List<String> presentStudents : dailyPresentLists) {
            for (String student : presentStudents) {
                attendance.merge(student, 1, Integer::sum);
            }
        }

        System.out.println("Total Attendance after " + totalDays + " days: " + attendance);

        // 3. Print the names of students who were present fewer than a threshold
        System.out.println("\nStudents with Attendance < " + threshold + " days:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " days)");
            }
        }
    }
}
