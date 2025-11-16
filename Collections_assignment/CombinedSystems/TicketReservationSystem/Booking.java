public class Booking implements Comparable<Booking> {
    String userId; int priority;
    public Booking(String id, int p) { this.userId = id; this.priority = p; }
    @Override public String toString() { return "Booking(" + userId + ", prio=" + priority + ")"; }
    @Override public int compareTo(Booking other) { return Integer.compare(other.priority, this.priority); }
}
