import java.util.Objects;
public class Patient {
    String patientId; String name;
    public Patient(String id, String n) { this.patientId = id; this.name = n; }
    @Override public String toString() { return "Patient(" + name + ", " + patientId + ")"; }
    @Override public boolean equals(Object o) { return ((Patient)o).patientId.equals(this.patientId); }
    @Override public int hashCode() { return Objects.hash(patientId); }
}
