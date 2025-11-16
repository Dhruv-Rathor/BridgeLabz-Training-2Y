public class Score implements Comparable<Score> {
    Player player; int points;
    public Score(Player p, int s) { this.player = p; this.points = s; }
    @Override public int compareTo(Score other) { return Integer.compare(other.points, this.points); }
    @Override public String toString() { return player + " = " + points + "pts"; }
}
