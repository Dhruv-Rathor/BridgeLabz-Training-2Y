import java.util.Objects;
public class Student implements Comparable<Student> {
    String id; String name; int marks;
    public Student(String id, String name, int marks) { this.id = id; this.name = name; this.marks = marks; }
    @Override public String toString() { return name + " (" + marks + ")"; }
    @Override public boolean equals(Object o) { return ((Student)o).id.equals(this.id); }
    @Override public int hashCode() { return Objects.hash(id); }
    @Override public int compareTo(Student other) { return Integer.compare(other.marks, this.marks); }
}
