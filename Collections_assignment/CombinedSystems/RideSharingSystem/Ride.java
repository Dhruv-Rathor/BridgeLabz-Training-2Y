public class Ride {
    String user; String driver;
    public Ride(String u, String d) { this.user = u; this.driver = d; }
    @Override public String toString() { return "Ride(" + user + " with " + driver + ")"; }
}
