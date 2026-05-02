import java.util.*;

public class NetworkRouting {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addConnection(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public boolean isConnectedNetwork(Set<String> allRouters) {
        if (allRouters.isEmpty()) return true;

        String start = allRouters.iterator().next();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            for (String neighbor : adjList.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return visited.size() == allRouters.size();
    }

    public int getMinHops(String start, String end) {
        if (start.equals(end)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> hops = new HashMap<>();

        queue.add(start);
        visited.add(start);
        hops.put(start, 0);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int currentHops = hops.get(curr);

            for (String neighbor : adjList.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    hops.put(neighbor, currentHops + 1);
                    queue.add(neighbor);

                    if (neighbor.equals(end)) {
                        return currentHops + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        NetworkRouting nr = new NetworkRouting();
        String[] routers = {"R1", "R2", "R3", "R4", "R5", "R6"};
        Set<String> networkSet = new HashSet<>(Arrays.asList(routers));

        nr.addConnection("R1", "R2");
        nr.addConnection("R1", "R3");
        nr.addConnection("R2", "R4");
        nr.addConnection("R3", "R4");
        nr.addConnection("R4", "R5");
        nr.addConnection("R5", "R6");

        System.out.println("Is network fully connected? " + nr.isConnectedNetwork(networkSet));
        System.out.println("Minimum hops from R1 to R6: " + nr.getMinHops("R1", "R6"));
    }
}
