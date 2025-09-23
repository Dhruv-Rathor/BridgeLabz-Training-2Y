import java.util.ArrayList;
import java.util.List;

interface Loanable {
    boolean applyForLoan();
    String calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String num, double bal) { this.accountNumber = num; this.balance = bal; }
    public void deposit(double amount) { if (amount > 0) this.balance += amount; }
    public void withdraw(double amount) { if (amount > 0 && this.balance >= amount) this.balance -= amount; }
    public abstract double calculateInterest();
    public double getBalance() { return balance; }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String num, double bal) { super(num, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.04; }
    @Override public boolean applyForLoan() { return getBalance() > 1000; }
    @Override public String calculateLoanEligibility() { return "Eligible for personal loan"; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String num, double bal) { super(num, bal); }
    @Override public double calculateInterest() { return getBalance() * 0.01; }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA001", 5000));
        accounts.add(new CurrentAccount("CA001", 10000));

        for (BankAccount acc : accounts) {
            System.out.println("Account interest: $" + acc.calculateInterest());
        }
    }
}
