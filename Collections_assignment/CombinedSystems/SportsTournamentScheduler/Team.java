import java.util.Objects;
public class Team implements Comparable<Team> {
    String name; int points;
    public Team(String name, int points) { this.name = name; this.points = points; }
    @Override public String toString() { return name + " (" + points + " pts)"; }
    @Override public boolean equals(Object o) { if (this == o) return true; if (o == null || getClass() != o.getClass()) return false; Team team = (Team) o; return name.equals(team.name); }
    @Override public int hashCode() { return Objects.hash(name); }
    @Override public int compareTo(Team other) { return Integer.compare(other.points, this.points); }
}
