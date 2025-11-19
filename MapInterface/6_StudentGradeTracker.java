import java.util.Map;
import java.util.TreeMap;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();

        // 1. Adds several students and their grades
        grades.put("Charlie", 85.5);
        grades.put("Alice", 92.0);
        grades.put("Bob", 78.5);
        grades.put("David", 95.0);

        System.out.println("Initial Grades: " + grades);

        // 2. Updates the grade for a student
        grades.put("Bob", 81.0);
        System.out.println("After Bob's update: " + grades);

        // 3. Removes a student
        grades.remove("Charlie");
        System.out.println("After Charlie dropped: " + grades);

        // 4. Prints out the list of students and grades in alphabetical order of names (TreeMap handles this automatically)
        System.out.println("\nFinal Grades in Alphabetical Order:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
