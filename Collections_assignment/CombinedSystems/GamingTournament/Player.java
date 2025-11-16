import java.util.Objects;
public class Player {
    String username;
    public Player(String u) { this.username = u; }
    @Override public String toString() { return "Player(" + username + ")"; }
    @Override public boolean equals(Object o) { return ((Player)o).username.equals(this.username); }
    @Override public int hashCode() { return username.hashCode(); }
}
