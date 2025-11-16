import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        List<Transaction> ledger = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Set<Account> validAccounts = new HashSet<>(Arrays.asList(new Account("A101"), new Account("B202")));
        Stack<Transaction> history = new Stack<>();
        
        pending.add(new Transaction("A101", "B202", 100.0));
        pending.add(new Transaction("C303", "A101", 50.0));

        while (!pending.isEmpty()) {
            Transaction tx = pending.remove();
            if (validAccounts.contains(new Account(tx.fromAccount)) && validAccounts.contains(new Account(tx.toAccount))) {
                System.out.println("Executing: " + tx);
                ledger.add(tx);
                history.push(tx);
            } else {
                System.out.println("Invalid Tx: " + tx);
            }
        }
        
        System.out.println("Ledger: " + ledger);
        if (!history.isEmpty()) {
            System.out.println("Rolling back: " + history.pop());
        }
    }
}
