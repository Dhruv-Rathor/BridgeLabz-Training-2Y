public class Movie {
    String title; String genre;
    public Movie(String t, String g) { this.title = t; this.genre = g; }
    @Override public String toString() { return "Movie(" + title + ")"; }
}
