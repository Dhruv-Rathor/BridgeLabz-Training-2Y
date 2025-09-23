import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String name;
    public Patient(String name) { this.name = name; }
    public abstract double calculateBill();
    public String getName() { return name; }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    public InPatient(String name, int days) { super(name); this.daysAdmitted = days; }
    @Override public double calculateBill() { return daysAdmitted * 500; }
    @Override public void addRecord(String rec) { System.out.println("Record added for " + getName()); }
    @Override public void viewRecords() { System.out.println("Viewing records for " + getName()); }
}

class OutPatient extends Patient {
    public OutPatient(String name) { super(name); }
    @Override public double calculateBill() { return 150; }
}

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient("Eve", 5));
        patients.add(new OutPatient("Frank"));

        for (Patient p : patients) {
            System.out.println("Patient " + p.getName() + ", Bill: $" + p.calculateBill());
        }
    }
}
