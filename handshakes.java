import java.util.Scanner;

public class handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number of students: ");
        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("the maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}
