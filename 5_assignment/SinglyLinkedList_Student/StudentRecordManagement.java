
import java.util.Scanner;



class Student {

    int rollNumber;

    String name;

    int age;

    String grade;

    Student next;



    Student(int rollNumber, String name, int age, String grade) {

        this.rollNumber = rollNumber;

        this.name = name;

        this.age = age;

        this.grade = grade;

        this.next = null;

    }

}



public class StudentRecordManagement {

    private Student head = null;



    public void addAtBeginning(int roll, String name, int age, String grade) {

        Student newNode = new Student(roll, name, age, grade);

        newNode.next = head;

        head = newNode;

    }



    public void display() {

        Student temp = head;

        while (temp != null) {

            System.out.println("ID: " + temp.rollNumber + " | Name: " + temp.name + " | Grade: " + temp.grade);

            temp = temp.next;

        }

    }



    public static void main(String[] args) {

        StudentRecordManagement list = new StudentRecordManagement();

        list.addAtBeginning(101, "Alice", 20, "A");

        list.addAtBeginning(102, "Bob", 21, "B");

        list.display();

    }

}

