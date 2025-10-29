class Student {
    public void displayStudent() {
        System.out.println("Student Name: Alex");
        System.out.println("Roll Number: 101");
    }
}

class Faculty {
    public void displayFaculty() {
        System.out.println("Faculty Name: Dr. Smith");
        System.out.println("Subject: Computer Science");
    }
}

public class Problem1_UserDefinedPackages {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        s.displayStudent();
        f.displayFaculty();
    }
}
