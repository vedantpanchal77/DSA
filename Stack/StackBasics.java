// Basic Stack Operations in Java: push(), pop(), peek(), size(), isEmpty()

import java.util.Stack;

public class StackBasics {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push()
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("After push(): " + stack);

        // peek()
        System.out.println("Top element using peek(): " + stack.peek());

        // size()
        System.out.println("Stack size: " + stack.size());

        // pop()
        System.out.println("Removed element using pop(): " + stack.pop());

        System.out.println("After pop(): " + stack);

        // isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Remove remaining elements
        stack.pop();
        stack.pop();

        System.out.println("After removing all elements: " + stack);

        // Check again
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}
