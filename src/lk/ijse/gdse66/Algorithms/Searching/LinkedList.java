package lk.ijse.gdse66.Algorithms.Searching;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 10:23 PM - 12/28/2023
 **/
public class LinkedList {
    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add a new node to the end of the linked list
    public void append(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Print the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.append("Alice");
        myList.append("Bob");
        myList.append("Charlie");

        System.out.print("Linked List : ");
        myList.display();
    }
}