public class Match {
    Team t1, t2;
    public Match(Team t1, Team t2) { this.t1 = t1; this.t2 = t2; }
    @Override public String toString() { return t1.name + " vs " + t2.name; }
}
