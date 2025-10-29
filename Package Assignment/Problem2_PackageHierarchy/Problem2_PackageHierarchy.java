class Course {
    public void printCourseDetails() {
        System.out.println("Course: Data Structures");
        System.out.println("Department: CSE");
    }
}

public class Problem2_PackageHierarchy {
    public static void main(String[] args) {
        Course cseCourse = new Course();
        cseCourse.printCourseDetails();
    }
}
