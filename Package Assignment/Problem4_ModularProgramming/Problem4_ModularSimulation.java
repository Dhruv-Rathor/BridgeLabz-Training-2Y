class StudentModule {
    public String getName() {
        return "Modular Alex";
    }
    public int getRollNumber() {
        return 202;
    }
}

public class Problem4_ModularSimulation {
    public static void main(String[] args) {
        StudentModule s = new StudentModule();
        System.out.println("Student: " + s.getName());
        System.out.println("Roll: " + s.getRollNumber());
    }
}
