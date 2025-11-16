public class Result {
    Match match; Player winner;
    public Result(Match m, Player w) { this.match = m; this.winner = w; }
    @Override public String toString() { return "Result: " + winner + " wins"; }
}
