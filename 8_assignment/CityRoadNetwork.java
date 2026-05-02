import java.util.*;

public class CityRoadNetwork {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addRoad(String u, String v, boolean isTwoWay) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        if (isTwoWay) {
            adjList.get(v).add(u);
        }
    }

    public List<String> getReachableIntersections(String start) {
        List<String> reachable = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            reachable.add(curr);

            for (String neighbor : adjList.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return reachable;
    }

    public int getFewestTurns(String start, String end) {
        if (start.equals(end)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> turns = new HashMap<>();

        queue.add(start);
        visited.add(start);
        turns.put(start, 0);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int currentTurns = turns.get(curr);

            for (String neighbor : adjList.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    turns.put(neighbor, currentTurns + 1);
                    queue.add(neighbor);

                    if (neighbor.equals(end)) {
                        return currentTurns + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        CityRoadNetwork crn = new CityRoadNetwork();
        crn.addRoad("A", "B", false);
        crn.addRoad("B", "C", true);
        crn.addRoad("A", "D", true);
        crn.addRoad("D", "E", false);
        crn.addRoad("C", "E", false);

        System.out.println("Reachable from A: " + crn.getReachableIntersections("A"));
        System.out.println("Fewest turns from A to E (via BFS): " + crn.getFewestTurns("A", "E"));
    }
}
