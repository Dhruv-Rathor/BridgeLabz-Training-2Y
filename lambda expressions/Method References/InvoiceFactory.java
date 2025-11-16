import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    
    Invoice(String id) {
        this.transactionId = id;
        System.out.println("Created invoice for ID: " + id);
    }
}

public class InvoiceFactory {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T1001", "T1002", "T1003");
        
        System.out.println("Generating invoices from IDs:");
        List<Invoice> invoices = transactionIds.stream()
                                             .map(Invoice::new)
                                             .collect(Collectors.toList());
    }
}
