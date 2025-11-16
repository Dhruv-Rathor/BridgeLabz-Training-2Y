import java.util.List;
import java.util.ArrayList;

abstract class CourseType {
    public abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    public String getEvaluationType() { return "Exam-Based"; }
}

class AssignmentCourse extends CourseType {
    public String getEvaluationType() { return "Assignment-Based"; }
}

class Course<T extends CourseType> {
    private String courseName;
    private T type;

    public Course(String courseName, T type) {
        this.courseName = courseName;
        this.type = type;
    }

    public String toString() {
        return courseName + " (" + type.getEvaluationType() + ")";
    }
}

public class CourseManagement {

    public static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        System.out.println("--- University Courses ---");
        for (Course<?> course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Calculus", new ExamCourse());
        Course<AssignmentCourse> history = new Course<>("WorldHistory", new AssignmentCourse());

        List<Course<? extends CourseType>> allCourses = new ArrayList<>();
        allCourses.add(math);
        allCourses.add(history);

        displayCourses(allCourses);
    }
}
