public class Result {
    Match match; String winner;
    public Result(Match m, String w) { this.match = m; this.winner = w; }
    @Override public String toString() { return match.toString() + " -> Winner: " + winner; }
}
