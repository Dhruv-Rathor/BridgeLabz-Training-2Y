import java.util.ArrayList;
import java.util.List;

class Professor {
    public String name;
    public List<Course> coursesTaught;

    public Professor(String name) {
        this.name = name;
        this.coursesTaught = new ArrayList<>();
    }

    public void assignProfessor(Course course) {
        this.coursesTaught.add(course);
        course.setProfessor(this);
    }
}

class Student {
    public String name;
    public List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        this.enrolledCourses.add(course);
        course.addStudent(this);
    }
}

class Course {
    public String name;
    public Professor professor;
    public List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }
    
    public void printDetails() {
        System.out.println("Course: " + name);
        System.out.println("  Professor: " + (professor != null ? professor.name : "TBA"));
        System.out.println("  Enrolled Students:");
        for (Student s : students) {
            System.out.println("  - " + s.name);
        }
    }
}

public class Problem8_UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Professor p1 = new Professor("Dr. Davis");
        
        Course oop = new Course("Object Oriented Programming");
        
        s1.enrollCourse(oop);
        s2.enrollCourse(oop);
        p1.assignProfessor(oop);
        
        oop.printDetails();
    }
}
