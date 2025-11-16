import java.util.*;
public class HospitalPatientSystem {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waitingRoom = new LinkedList<>();
        Stack<Patient> recentlyDischarged = new Stack<>();
        List<Patient> totalHistory = new ArrayList<>();
        
        Patient p1 = new Patient("P101", "Alice");
        Patient p2 = new Patient("P102", "Bob");
        
        admitted.add(p1);
        waitingRoom.add(p1);
        totalHistory.add(p1);
        
        admitted.add(p2);
        waitingRoom.add(p2);
        totalHistory.add(p2);
        
        Patient treated = waitingRoom.remove();
        System.out.println("Treating: " + treated);
        
        admitted.remove(treated);
        recentlyDischarged.push(treated);
        System.out.println("Discharged: " + treated);
        
        System.out.println("Re-admit last patient: " + recentlyDischarged.pop());
    }
}
