public class AsyncJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Task executed asynchronously");
        new Thread(job).start();
    }
}
