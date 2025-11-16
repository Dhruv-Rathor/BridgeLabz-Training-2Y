import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String patientId;
    int severity;
    
    Alert(String id, int s) {
        this.patientId = id;
        this.severity = s;
    }
    
    public String toString() {
        return "Alert for " + patientId + " (Severity: " + severity + ")";
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("P101", 8));
        alerts.add(new Alert("P102", 3));
        alerts.add(new Alert("P103", 9));
        
        Predicate<Alert> highSeverityFilter = (alert) -> alert.severity > 7;
        
        List<Alert> highAlerts = alerts.stream()
                                       .filter(highSeverityFilter)
                                       .collect(Collectors.toList());
                                       
        System.out.println("High severity alerts:");
        highAlerts.forEach(System.out::println);
    }
}
