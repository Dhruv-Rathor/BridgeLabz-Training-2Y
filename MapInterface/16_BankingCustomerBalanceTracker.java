import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BankingCustomerBalanceTracker {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();

        // 1. Add new customer accounts with an initial balance
        accounts.put("ACC001", 5000.00);
        accounts.put("ACC002", 15000.00);
        accounts.put("ACC003", 2000.00);
        accounts.put("ACC004", 7500.00);
        accounts.put("ACC005", 25000.00);
        accounts.put("ACC006", 100.00);

        System.out.println("Initial Balances: " + accounts);

        // 2. Allow deposit and withdrawal operations
        deposit(accounts, "ACC002", 500.00);
        withdraw(accounts, "ACC004", 1000.00);
        withdraw(accounts, "ACC006", 500.00); // Exceeds balance

        System.out.println("\nBalances After Transactions: " + accounts);

        // 3. Print all customers sorted by descending balance
        Map<String, Double> sortedByBalance = accounts.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new
            ));

        System.out.println("\nCustomers Sorted by Balance (Descending):");
        sortedByBalance.forEach((acc, balance) -> System.out.printf("%s: %.2f%n", acc, balance));

        // 4. Identify the top 3 customers with the highest balance
        System.out.println("\nTop 3 Highest Balances:");
        sortedByBalance.entrySet().stream()
            .limit(3)
            .forEach(entry -> System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue()));
    }

    public static void deposit(Map<String, Double> accounts, String account, double amount) {
        accounts.merge(account, amount, Double::sum);
        System.out.printf("Deposited %.2f into %s. New Balance: %.2f%n", amount, account, accounts.get(account));
    }

    public static void withdraw(Map<String, Double> accounts, String account, double amount) {
        Double balance = accounts.get(account);
        if (balance == null) {
            System.out.println("Error: Account " + account + " not found.");
            return;
        }
        if (balance >= amount) {
            accounts.put(account, balance - amount);
            System.out.printf("Withdrew %.2f from %s. New Balance: %.2f%n", amount, account, accounts.get(account));
        } else {
            System.out.printf("Withdrawal failed for %s. Amount %.2f exceeds balance %.2f.%n", account, amount, balance);
        }
    }
}
