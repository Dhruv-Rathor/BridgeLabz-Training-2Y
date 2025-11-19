import java.util.HashMap;
import java.util.Map;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> registration = new HashMap<>();
        int capacityThreshold = 50;
        int underSubscribedThreshold = 5;

        // 1. Add courses with initial registration counts
        registration.put("CS101", 45);
        registration.put("MATH200", 52);
        registration.put("ART105", 2);
        registration.put("HIST310", 15);
        registration.put("CHEM100", 60);

        System.out.println("Initial Registration: " + registration);

        // 2. Add or drop students
        changeRegistration(registration, "CS101", 10);  // Add 10 students
        changeRegistration(registration, "ART105", -1); // Drop 1 student
        changeRegistration(registration, "MATH200", -5); // Drop 5 students
        changeRegistration(registration, "NONEXIST", 5); // Non-existent course

        System.out.println("Final Registration: " + registration);

        // 3. Print course reports
        System.out.println("\nCourses Near Full (Count >= " + capacityThreshold + "):");
        for (Map.Entry<String, Integer> entry : registration.entrySet()) {
            if (entry.getValue() >= capacityThreshold) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " students)");
            }
        }

        System.out.println("\nCourses Under-Subscribed (Count < " + underSubscribedThreshold + "):");
        for (Map.Entry<String, Integer> entry : registration.entrySet()) {
            if (entry.getValue() < underSubscribedThreshold) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + " students)");
            }
        }
    }

    public static void changeRegistration(Map<String, Integer> registration, String course, int delta) {
        registration.computeIfPresent(course, (k, currentCount) -> {
            int newCount = currentCount + delta;
            return Math.max(0, newCount); // Count should never go negative
        });
        if (!registration.containsKey(course)) {
            System.out.println("Error: Course " + course + " not found for registration change.");
        }
    }
}
