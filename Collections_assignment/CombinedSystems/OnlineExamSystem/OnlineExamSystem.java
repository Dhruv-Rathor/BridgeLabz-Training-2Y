import java.util.*;
public class OnlineExamSystem {
    public static void main(String[] args) {
        Set<String> studentIds = new HashSet<>();
        studentIds.add("S101");
        studentIds.add("S102");
        studentIds.add("S101");
        System.out.println("Enrolled students: " + studentIds);

        Queue<Student> waitingQueue = new LinkedList<>();
        waitingQueue.add(new Student("S101"));
        waitingQueue.add(new Student("S102"));
        
        List<Question> questions = new ArrayList<>(Arrays.asList(new Question("Q1"), new Question("Q2"), new Question("Q3")));
        Collections.shuffle(questions);
        
        Stack<Question> history = new Stack<>();
        
        System.out.println("Serving: " + waitingQueue.remove());
        
        history.push(questions.get(0));
        System.out.println("Current Q: " + history.peek());
        history.push(questions.get(1));
        System.out.println("Current Q: " + history.peek());
        System.out.println("Going back: " + history.pop());
        System.out.println("Current Q: " + history.peek());
    }
}
