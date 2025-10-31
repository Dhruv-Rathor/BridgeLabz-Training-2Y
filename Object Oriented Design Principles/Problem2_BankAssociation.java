import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        this.customers.add(customer);
        customer.setAccount(this, initialDeposit);
        System.out.println("Account opened for " + customer.getName() + " at " + this.name);
    }
}

class Customer {
    private String name;
    private Bank associatedBank;
    private double balance;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccount(Bank bank, double balance) {
        this.associatedBank = bank;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println("Customer " + name + " has a balance of $" + balance + " at " + associatedBank.name);
    }
}

public class Problem2_BankAssociation {
    public static void main(String[] args) {
        Bank myBank = new Bank("Global Trust Bank");
        Customer customer1 = new Customer("Alice");
        
        myBank.openAccount(customer1, 1000.0);
        customer1.viewBalance();
    }
}
