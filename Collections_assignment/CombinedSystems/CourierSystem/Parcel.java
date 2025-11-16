public class Parcel implements Comparable<Parcel> {
    String id; int priority;
    public Parcel(String id, int p) { this.id = id; this.priority = p; }
    @Override public String toString() { return "Parcel(" + id + ", prio=" + priority + ")"; }
    @Override public int compareTo(Parcel other) { return Integer.compare(other.priority, this.priority); }
}
