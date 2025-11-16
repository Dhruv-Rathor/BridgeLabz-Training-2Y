import java.util.*;
public class StreamingSystem {
    public static void main(String[] args) {
        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> genresWatched = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();
        
        Movie m1 = new Movie("Inception", "Sci-Fi");
        Movie m2 = new Movie("The Matrix", "Sci-Fi");
        Movie m3 = new Movie("Gladiator", "Action");
        
        upNext.add(m1);
        upNext.add(m2);
        
        Movie playing = upNext.remove();
        System.out.println("Playing: " + playing);
        watchHistory.push(playing);
        genresWatched.add(playing.genre);
        
        System.out.println("Up Next: " + upNext.peek());
        System.out.println("Last Watched: " + watchHistory.peek());
        System.out.println("Genres: " + genresWatched);
    }
}
