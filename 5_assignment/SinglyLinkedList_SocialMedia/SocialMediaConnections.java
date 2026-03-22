
class User {

    int userId;

    String name;

    User next;



    User(int userId, String name) {

        this.userId = userId;

        this.name = name;

    }

}



public class SocialMediaConnections {

    private User head = null;



    public void addUser(int id, String name) {

        User newNode = new User(id, name);

        newNode.next = head;

        head = newNode;

    }



    public void displayUsers() {

        User temp = head;

        while (temp != null) {

            System.out.println("User: " + temp.name);

            temp = temp.next;

        }

    }



    public static void main(String[] args) {

        SocialMediaConnections sm = new SocialMediaConnections();

        sm.addUser(1, "John");

        sm.addUser(2, "Jane");

        sm.displayUsers();

    }

}

