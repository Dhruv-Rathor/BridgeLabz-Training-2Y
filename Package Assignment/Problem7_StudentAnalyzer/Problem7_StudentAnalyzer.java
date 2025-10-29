class Student {
    public String name;
    public int marks1, marks2, marks3;

    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    @Override
    public String toString() {
        return "Student: " + name + " [Marks: " + marks1 + ", " + marks2 + ", " + marks3 + "]";
    }
}

class Analyzer {
    public double calculateAverage(Student s) {
        return (s.marks1 + s.marks2 + s.marks3) / 3.0;
    }

    public char findGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }
}

public class Problem7_StudentAnalyzer {
    public static void main(String[] args) {
        Student student = new Student("Meena", 90, 85, 92);
        Analyzer analyzer = new Analyzer();

        double avg = analyzer.calculateAverage(student);
        char grade = analyzer.findGrade(avg);

        System.out.println(student.toString());
        System.out.printf("Average: %.2f\n", avg);
        System.out.println("Grade: " + grade);
    }
}
