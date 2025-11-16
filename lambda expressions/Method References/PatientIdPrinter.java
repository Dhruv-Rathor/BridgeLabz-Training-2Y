import java.util.List;
import java.util.Arrays;

public class PatientIdPrinter {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P101", "P102", "P103");
        
        System.out.println("Printing all patient IDs:");
        patientIds.forEach(System.out::println);
    }
}
