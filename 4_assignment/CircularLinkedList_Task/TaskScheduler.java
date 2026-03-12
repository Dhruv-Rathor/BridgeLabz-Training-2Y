
class Task {

    int id;

    String name;

    Task next;



    Task(int id, String name) {

        this.id = id;

        this.name = name;

    }

}



public class TaskScheduler {

    private Task head = null;

    private Task tail = null;



    public void addTask(int id, String name) {

        Task newNode = new Task(id, name);

        if (head == null) {

            head = newNode;

            tail = newNode;

            newNode.next = head;

        } else {

            tail.next = newNode;

            tail = newNode;

            tail.next = head;

        }

    }



    public void display() {

        if (head == null) return;

        Task temp = head;

        do {

            System.out.println("Task: " + temp.name);

            temp = temp.next;

        } while (temp != head);

    }



    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(1, "Data Backup");

        scheduler.addTask(2, "System Scan");

        scheduler.display();

    }

}

