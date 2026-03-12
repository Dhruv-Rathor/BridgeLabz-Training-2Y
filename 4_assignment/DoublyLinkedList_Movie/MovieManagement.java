
class Movie {

    String title;

    String director;

    int year;

    double rating;

    Movie next, prev;



    Movie(String title, String director, int year, double rating) {

        this.title = title;

        this.director = director;

        this.year = year;

        this.rating = rating;

    }

}



public class MovieManagement {

    private Movie head, tail;



    public void addEnd(String title, String dir, int yr, double rate) {

        Movie newNode = new Movie(title, dir, yr, rate);

        if (head == null) {

            head = tail = newNode;

        } else {

            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

        }

    }



    public void displayForward() {

        Movie temp = head;

        while (temp != null) {

            System.out.println(temp.title + " (" + temp.year + ")");

            temp = temp.next;

        }

    }



    public static void main(String[] args) {

        MovieManagement list = new MovieManagement();

        list.addEnd("Inception", "Nolan", 2010, 8.8);

        list.addEnd("Avatar", "Cameron", 2009, 7.8);

        list.displayForward();

    }

}

