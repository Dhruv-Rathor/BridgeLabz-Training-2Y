public class Account {
    String accountId;
    public Account(String id) { this.accountId = id; }
    @Override public boolean equals(Object o) { return ((Account)o).accountId.equals(this.accountId); }
    @Override public int hashCode() { return accountId.hashCode(); }
}
