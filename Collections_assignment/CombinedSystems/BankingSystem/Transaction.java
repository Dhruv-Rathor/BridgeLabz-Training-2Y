public class Transaction {
    String fromAccount; String toAccount; double amount;
    public Transaction(String from, String to, double amt) { this.fromAccount = from; this.toAccount = to; this.amount = amt; }
    @Override public String toString() { return "Tx[" + fromAccount + "->" + toAccount + ": $" + amount + "]"; }
}
