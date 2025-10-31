import java.util.ArrayList;
import java.util.List;

class Patient {
    public String name;
    public List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
}

class Doctor {
    public String name;
    public List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + this.name + " is consulting " + patient.name);
        this.patients.add(patient);
        patient.doctors.add(this);
    }
}

class Hospital {
    public String name;
    public List<Doctor> doctors;
    public List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
}

public class Problem6_HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital mainHospital = new Hospital("City General");
        
        Doctor doc1 = new Doctor("Smith");
        Doctor doc2 = new Doctor("Jones");
        
        Patient p1 = new Patient("Mark");
        Patient p2 = new Patient("Susan");
        
        mainHospital.doctors.add(doc1);
        mainHospital.doctors.add(doc2);
        mainHospital.patients.add(p1);
        mainHospital.patients.add(p2);
        
        doc1.consult(p1);
        doc2.consult(p1);
        doc1.consult(p2);
    }
}
