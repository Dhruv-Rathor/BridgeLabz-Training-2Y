public class Match {
    Player p1, p2;
    public Match(Player p1, Player p2) { this.p1 = p1; this.p2 = p2; }
    @Override public String toString() { return p1 + " vs " + p2; }
}
