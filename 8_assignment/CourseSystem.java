import java.util.*;

public class CourseSystem {
    private Map<String, List<String>> adjList = new HashMap<>();
    private Map<String, Integer> inDegree = new HashMap<>();

    public void addCourse(String course) {
        adjList.putIfAbsent(course, new ArrayList<>());
        inDegree.putIfAbsent(course, 0);
    }

    public void addPrerequisite(String pre, String course) {
        addCourse(pre);
        addCourse(course);
        adjList.get(pre).add(course);
        inDegree.put(course, inDegree.get(course) + 1);
    }

    public List<String> topologicalSort() {
        List<String> order = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        for (String course : inDegree.keySet()) {
            if (inDegree.get(course) == 0) {
                queue.add(course);
            }
        }

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            order.add(curr);

            for (String neighbor : adjList.get(curr)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.add(neighbor);
                }
            }
        }

        if (order.size() != inDegree.size()) {
            System.out.println("Cycle detected! Cannot complete all courses.");
            return new ArrayList<>();
        }
        return order;
    }

    public static void main(String[] args) {
        CourseSystem cs = new CourseSystem();
        cs.addPrerequisite("CS101", "CS102");
        cs.addPrerequisite("CS101", "CS201");
        cs.addPrerequisite("CS102", "CS202");
        cs.addPrerequisite("MATH101", "CS201");

        List<String> validOrder = cs.topologicalSort();
        System.out.println("Valid course completion order: " + validOrder);
    }
}
