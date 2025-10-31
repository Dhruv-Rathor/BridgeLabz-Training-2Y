import java.util.ArrayList;
import java.util.List;

class Course {
    public String name;
    public List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    public String name;
    public List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

class School {
    public String name;
    public List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}

public class Problem4_SchoolStudentCourse {
    public static void main(String[] args) {
        School mySchool = new School("Central High");
        
        Student s1 = new Student("John");
        Student s2 = new Student("Jane");
        
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);
        
        Course math = new Course("Math 101");
        Course history = new Course("History 101");
        
        s1.enrollInCourse(math);
        s1.enrollInCourse(history);
        s2.enrollInCourse(math);
        
        s1.viewEnrolledCourses();
        System.out.println();
        math.showEnrolledStudents();
    }
}
