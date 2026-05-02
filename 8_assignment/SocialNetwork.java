import java.util.*;

public class SocialNetwork {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addFriendship(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public List<String> getFriends(String user) {
        return adjList.getOrDefault(user, new ArrayList<>());
    }

    public boolean isConnected(String u, String v) {
        return getFriends(u).contains(v);
    }

    public int getShortestPath(String start, String end) {
        if (start.equals(end)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> distances = new HashMap<>();

        queue.add(start);
        visited.add(start);
        distances.put(start, 0);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int dist = distances.get(curr);

            for (String neighbor : getFriends(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    distances.put(neighbor, dist + 1);
                    queue.add(neighbor);
                    
                    if (neighbor.equals(end)) {
                        return dist + 1;
                    }
                }
            }
        }
        return -1; // Path not found
    }

    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();
        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");
        sn.addFriendship("Bob", "David");
        sn.addFriendship("Charlie", "Eve");
        sn.addFriendship("David", "Eve");

        System.out.println("Alice's friends: " + sn.getFriends("Alice"));
        System.out.println("Are Bob and Eve directly connected? " + sn.isConnected("Bob", "Eve"));
        System.out.println("Shortest path from Alice to Eve: " + sn.getShortestPath("Alice", "Eve"));
    }
}
