public class Package {
    String packageId; String destination;
    public Package(String id, String dest) { this.packageId = id; this.destination = dest; }
    @Override public String toString() { return "Pkg(" + packageId + " to " + destination + ")"; }
}
