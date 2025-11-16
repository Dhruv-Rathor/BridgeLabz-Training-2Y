public class RideRequest {
    String user; int priority;
    public RideRequest(String u, int p) { this.user = u; this.priority = p; }
    @Override public String toString() { return "Request(" + user + ", prio=" + priority + ")";}
}
