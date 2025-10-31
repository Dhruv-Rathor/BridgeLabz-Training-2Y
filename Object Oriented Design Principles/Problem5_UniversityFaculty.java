import java.util.ArrayList;
import java.util.List;

class Faculty {
    public String name;

    public Faculty(String name) {
        this.name = name;
    }
}

class Department {
    public String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    public String name;
    private List<Department> departments;
    private List<Faculty> facultyMembers;

    public University(String name) {
        this.name = name;
        // Composition: Departments are created and owned by University
        this.departments = new ArrayList<>();
        this.departments.add(new Department("Computer Science"));
        this.departments.add(new Department("Physics"));
        
        // Aggregation: University holds references to Faculty
        this.facultyMembers = new ArrayList<>();
    }

    public void hireFaculty(Faculty faculty) {
        this.facultyMembers.add(faculty);
        System.out.println("Hired " + faculty.name + " at " + this.name);
    }

    public void showStructure() {
        System.out.println("University: " + this.name);
        System.out.println("Departments (Composition):");
        for (Department d : departments) {
            System.out.println("- " + d.name);
        }
        System.out.println("Faculty (Aggregation):");
        for (Faculty f : facultyMembers) {
            System.out.println("- " + f.name);
        }
    }
}

public class Problem5_UniversityFaculty {
    public static void main(String[] args) {
        Faculty profA = new Faculty("Dr. Alan Turing");
        Faculty profB = new Faculty("Dr. Marie Curie");

        University myU = new University("Tech University");
        
        myU.hireFaculty(profA);
        myU.hireFaculty(profB);
        
        myU.showStructure();
        
        myU = null;
        
        System.out.println("\nUniversity object is deleted.");
        System.out.println(profA.name + " still exists (Aggregation).");
    }
}
