import java.util.*;
public class AdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        applicants.add(new Student("S1", "Alice", 95));
        applicants.add(new Student("S2", "Bob", 80));
        applicants.add(new Student("S3", "Charlie", 90));
        
        Set<Student> shortlisted = new HashSet<>();
        for (Student s : applicants) {
            if (s.marks >= 90) {
                shortlisted.add(s);
            }
        }
        System.out.println("Shortlisted: " + shortlisted);
        
        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);
        System.out.println("Interviewing: " + interviewQueue.remove());
        
        TreeSet<Student> meritList = new TreeSet<>(shortlisted);
        System.out.println("Merit List: " + meritList);
    }
}
