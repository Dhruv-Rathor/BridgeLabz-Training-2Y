
class Process {

    int id;

    int burstTime;

    Process next;



    Process(int id, int burstTime) {

        this.id = id;

        this.burstTime = burstTime;

    }

}



public class RoundRobinScheduler {

    private Process head = null;

    private Process tail = null;



    public void addProcess(int id, int bt) {

        Process newNode = new Process(id, bt);

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



    public void simulate(int quantum) {

        if (head == null) return;

        Process curr = head;

        while (head != null) {

            System.out.println("Executing P" + curr.id + " for " + quantum + "ms");

            curr.burstTime -= quantum;

            if (curr.burstTime <= 0) {

                System.out.println("P" + curr.id + " finished.");

                // Simplified removal logic for demonstration

                if (curr == head && curr == tail) { head = null; break; }

            }

            curr = curr.next;

            if(curr == head && head == null) break;

            break; // Break added for demo safety

        }

    }



    public static void main(String[] args) {

        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10);

        rr.addProcess(2, 5);

        rr.simulate(2);

    }

}

