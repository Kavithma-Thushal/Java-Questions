package lk.ijse.gdse66.Algorithms;

import java.util.LinkedList;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 10:12 PM - 12/28/2023
 **/
public class Queue {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        java.util.Queue<String> queue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        System.out.println("Queue: " + queue);

        // Dequeue (remove) elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        System.out.println("Queue after dequeue: " + queue);

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        System.out.println("Queue after peek: " + queue);
    }
}