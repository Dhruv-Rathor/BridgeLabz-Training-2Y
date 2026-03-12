
class Ticket {

    int id;

    String customer;

    Ticket next;



    Ticket(int id, String customer) {

        this.id = id;

        this.customer = customer;

    }

}



public class TicketReservation {

    private Ticket head = null;

    private Ticket tail = null;



    public void reserve(int id, String name) {

        Ticket newNode = new Ticket(id, name);

        if (head == null) {

            head = tail = newNode;

            newNode.next = head;

        } else {

            tail.next = newNode;

            tail = newNode;

            tail.next = head;

        }

    }



    public void showTickets() {

        if (head == null) return;

        Ticket temp = head;

        do {

            System.out.println("Ticket ID: " + temp.id + " for " + temp.customer);

            temp = temp.next;

        } while (temp != head);

    }



    public static void main(String[] args) {

        TicketReservation system = new TicketReservation();

        system.reserve(501, "David");

        system.reserve(502, "Sarah");

        system.showTickets();

    }

}

