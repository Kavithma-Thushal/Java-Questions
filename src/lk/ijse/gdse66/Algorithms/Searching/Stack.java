package lk.ijse.gdse66.Algorithms.Searching;

import java.util.LinkedList;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 10:20 PM - 12/28/2023
 **/
public class Stack {
    private LinkedList<String> list = new LinkedList<>();

    // Push (add) an element to the top of the stack
    public void push(String element) {
        list.addFirst(element);
    }

    // Pop (remove) the element from the top of the stack
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    // Peek at the top element without removing it
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        myStack.push("Alice");
        myStack.push("Bob");
        myStack.push("Charlie");

        System.out.println("Stack: " + myStack);

        String poppedElement = myStack.pop();
        System.out.println("Popped Element: " + poppedElement);

        System.out.println("Stack after pop: " + myStack);

        String topElement = myStack.peek();
        System.out.println("Top Element: " + topElement);

        System.out.println("Stack after peek: " + myStack);
    }
}